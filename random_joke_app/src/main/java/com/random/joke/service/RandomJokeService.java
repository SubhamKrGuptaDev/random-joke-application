package com.random.joke.service;

import com.random.joke.client.RandomJokeClient;
import com.random.joke.records.RandomJokeResponse;
import org.springframework.stereotype.Service;

@Service
public class RandomJokeService {

    private final RandomJokeClient randomJokeClient;

    public RandomJokeService(RandomJokeClient webClient) {
        this.randomJokeClient = webClient;
    }

    public String getRandomJokeString() {
        RandomJokeResponse joke = randomJokeClient.getRandomJoke();
        try {
            String setup = joke.setup();
            String punchline = joke.punchline();
            return "Setup : " + setup + "\nPunchline : " + punchline;
        } catch (Exception ex) {
            return "Exception: " + ex.getMessage();
        }
    }

    public RandomJokeResponse getRandomJokeResponse() {
        return randomJokeClient.getRandomJoke();
    }

}
