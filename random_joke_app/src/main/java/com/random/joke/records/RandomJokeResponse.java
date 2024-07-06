package com.random.joke.records;

public record RandomJokeResponse(Integer id, String type, String setup, String punchline) {

    @Override
    public String toString() {
        return "{" + "\n" +
                "\tid=" + id + ",\n" +
                "\ttype=" + type + ",\n" +
                "\tsetup=" + setup + ",\n" +
                "\tpunchline=" + punchline + "\n" +
                '}';
    }
}
