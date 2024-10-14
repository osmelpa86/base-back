package com.osmeldevs.base.name.application.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;

@Configuration
public class Util {
    @Bean
    public Clock clock() {
        return Clock.systemUTC();
    }
}