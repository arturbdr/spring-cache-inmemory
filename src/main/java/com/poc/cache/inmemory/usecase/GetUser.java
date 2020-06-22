package com.poc.cache.inmemory.usecase;

import com.poc.cache.inmemory.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class GetUser {

    @Cacheable(
            value = "toggle",
            key = "#userId")
    public User execute(final String userId) {
        log.info("calling gateway to return user {}", userId);
        return User.builder()
                .id(userId)
                .age(10)
                .name("Bla!")
                .build();
    }


}
