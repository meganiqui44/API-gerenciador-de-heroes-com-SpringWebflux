package com.douglas.apiheroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HeroesdouglasApiApplication {

  public static void main(String[] args) {

    SpringApplication.run(HeroesdouglasApiApplication.class, args);
    System.out.println("super poderes com webflux");
  }

}

