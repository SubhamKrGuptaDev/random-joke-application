package com.random.joke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfiguration {

    @Bean("webClientDadJoke")
    public WebClient webClientDadJoke() {
        return WebClient.builder()
                .baseUrl("https://icanhazdadjoke.com/")
                .build();
    }

    @Bean("webClientRandomJoke")
    public WebClient webClientRandomJoke() {
        return WebClient.builder()
                .baseUrl("https://official-joke-api.appspot.com/random_joke")
                .build();
    }

}
