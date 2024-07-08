package com.random.joke.client;

import com.random.joke.records.RandomJokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface RandomJokeClient {

    @GetExchange("/")
    RandomJokeResponse getRandomJoke();

}
