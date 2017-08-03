package com.example.demo;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class AmarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmarServiceApplication.class, args);
	}

	@Bean
  CommandLineRunner commandLineRunner(final PersonRepository personRepository) {
	  return strings -> {
      DataFactory dataFactory = new DataFactory();
      for (int i = 0; i < 200; i++) {
        personRepository.save(new Person(dataFactory.getFirstName(), dataFactory.getLastName(), dataFactory.getAddress(),
          dataFactory.getBirthDate()));
      }
        personRepository.findAll().forEach(System.out::println);
      };
  }
}
