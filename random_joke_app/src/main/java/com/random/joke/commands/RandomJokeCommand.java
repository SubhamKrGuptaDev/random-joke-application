package com.random.joke.commands;


import com.random.joke.service.RandomJokeService;
import org.jline.terminal.Terminal;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class RandomJokeCommand {

    private final RandomJokeService randomJokeService;
    private final Terminal terminal;

    public RandomJokeCommand(RandomJokeService randomJokeService, Terminal terminal) {
        this.randomJokeService = randomJokeService;
        this.terminal = terminal;
    }

    @ShellMethod(key = "random-joke", value = "Get random joke")
    public String randomJoke() {
        return randomJokeService.getRandomJokeString();
    }

    @ShellMethod(key = "random-joke-response", value = "It's Show the random-joke response")
    public String randomJokeJson() {
        return randomJokeService.getRandomJokeResponse().toString();
    }

}
