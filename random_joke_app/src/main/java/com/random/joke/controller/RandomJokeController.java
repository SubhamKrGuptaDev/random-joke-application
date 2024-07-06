package com.random.joke.controller;


import com.random.joke.records.RandomJokeResponse;
import com.random.joke.service.RandomJokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Objects;

//@RestController
public class RandomJokeController {

//    private final RandomJokeService randomJokeService;
//
//    public RandomJokeController(RandomJokeService randomJokeService) {
//        this.randomJokeService = randomJokeService;
//    }
//
//    @GetMapping("/random-joke")
//    public String randomJoke() {
//        Mono<RandomJokeResponse> randomJoke = randomJokeService.getRandomJoke();
//
//        String setup = Objects.requireNonNull(randomJoke.block()).setup();
//        String punchline = Objects.requireNonNull(randomJoke.block()).punchline();
//
//        return "Setup : " + setup + "\nPunchline : " + punchline;
//    }

}
