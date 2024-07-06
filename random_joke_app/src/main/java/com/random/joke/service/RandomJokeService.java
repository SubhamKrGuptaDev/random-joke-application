package com.random.joke.service;

import com.random.joke.records.RandomJokeResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Service
public class RandomJokeService {

    private final WebClient dadJokeClient;
    private final WebClient randomJokeClient;

    public RandomJokeService(@Qualifier("webClientDadJoke") WebClient dadJokeClient,
                             @Qualifier("webClientRandomJoke") WebClient randomJokeClient) {
        this.dadJokeClient = dadJokeClient;
        this.randomJokeClient = randomJokeClient;
    }

    public String getRandomJokeString() {
        Mono<RandomJokeResponse> randomJokeResponseMono = randomJokeClient.get()
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(RandomJokeResponse.class);

        String setup = Objects.requireNonNull(randomJokeResponseMono.block()).setup();
        String punchline = Objects.requireNonNull(randomJokeResponseMono.block()).punchline();

        return "Setup : " + setup + "\nPunchline : " + punchline;
    }

    public RandomJokeResponse getRandomJokeResponse() {
        Mono<RandomJokeResponse> randomJokeResponseMono = randomJokeClient.get()
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(RandomJokeResponse.class);

        return randomJokeResponseMono
                .blockOptional()
                .orElse(null);
    }

}
