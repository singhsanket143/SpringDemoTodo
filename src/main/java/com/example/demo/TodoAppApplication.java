package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		// Configure dotenv to load the env variables from my .env file
		Dotenv dotenv = Dotenv.configure().load();

		dotenv.entries().forEach((entry) -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(TodoAppApplication.class, args);
	}

}
