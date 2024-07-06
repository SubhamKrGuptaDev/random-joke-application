package com.random.joke.commands;


import com.random.joke.records.RandomJokeResponse;
import com.random.joke.service.RandomJokeService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class RandomJokeCommand {

    private final RandomJokeService randomJokeService;

    public RandomJokeCommand(RandomJokeService randomJokeService) {
        this.randomJokeService = randomJokeService;
    }

    @ShellMethod(key = "random-joke")
    public String randomJoke() {
        return randomJokeService.getRandomJokeString();
    }

    @ShellMethod(key = "random-joke-response")
    public String randomJokeJson() {
        return randomJokeService.getRandomJokeResponse().toString();
    }

}
