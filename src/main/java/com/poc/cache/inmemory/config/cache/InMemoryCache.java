//package com.poc.cache.inmemory.config.cache;
//
//import org.ehcache.config.builders.CacheConfigurationBuilder;
//import org.ehcache.config.builders.CacheManagerBuilder;
//import org.ehcache.config.builders.ExpiryPolicyBuilder;
//import org.ehcache.config.builders.ResourcePoolsBuilder;
//import org.ehcache.config.units.MemoryUnit;
//import org.ehcache.event.EventFiring;
//import org.ehcache.expiry.Expirations;
//import org.springframework.cache.ehcache.EhCacheManagerUtils;
//import org.springframework.cache.interceptor.SimpleKey;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.cache.Cache;
//import javax.cache.CacheManager;
//import javax.cache.Caching;
//import javax.cache.spi.CachingProvider;
//import java.net.URISyntaxException;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//@Configuration
//public class InMemoryCache {
//
//    @Bean
//    public CacheManager cacheManager() throws Exception {
//        CachingProvider provider = Caching.getCachingProvider();
//        final CacheManager cacheManager = provider.getCacheManager();
//
//        CacheConfigurationBuilder<SimpleKey, Double> configuration =
//                CacheConfigurationBuilder.newCacheConfigurationBuilder(org.springframework.cache.interceptor.SimpleKey.class,
//                        java.lang.Double.class,
//                        ResourcePoolsBuilder.heap(2).offheap(10, MemoryUnit.MB))
//                        .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(5)));
//
//
//        return cacheManager;
//    }
//
//    @Bean
//    public CacheManager cacheManagerBla() throws URISyntaxException {
//        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
//                .withCache("preConfigured",
//                        CacheConfigurationBuilder.newCacheConfigurationBuilder(Long.class, String.class,
//                                ResourcePoolsBuilder.heap(100))
//                                .build())
//                .build(true);
//    }
//}
//
//
