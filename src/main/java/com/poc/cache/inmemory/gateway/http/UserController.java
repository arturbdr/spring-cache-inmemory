package com.poc.cache.inmemory.gateway.http;

import com.poc.cache.inmemory.domain.User;
import com.poc.cache.inmemory.usecase.GetUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final GetUser getUser;
    private final CacheManager cacheManager;

    @GetMapping("user")
    public ResponseEntity<User> getUser(@RequestParam final String userId) {
        return ResponseEntity.ok(getUser.execute(userId));
    }

    @GetMapping("user2")
    public ResponseEntity<User> getBla(@RequestParam final String userId) {
        final Cache toggle = cacheManager.getCache("toggle");
        if (toggle != null && toggle.get(userId) != null) {
            User user = (User) toggle.get(userId).get();
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.noContent().build();
    }
}
