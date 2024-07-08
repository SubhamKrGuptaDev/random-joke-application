package com.random.joke;

import com.random.joke.client.RandomJokeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class RandomJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomJokeAppApplication.class, args);
	}

	@Bean
	public RandomJokeClient randomJokeClient() {
		WebClient build = WebClient.builder()
				.baseUrl("https://official-joke-api.appspot.com/random_joke")
				.defaultHeader("Accept", "application/json")
				.build();

		HttpServiceProxyFactory factory = HttpServiceProxyFactory
				.builderFor(WebClientAdapter.create(build))
				.build();

		return factory.createClient(RandomJokeClient.class);
	}

}
