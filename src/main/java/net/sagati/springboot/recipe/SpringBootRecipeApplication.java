package net.sagati.springboot.recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRecipeApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootRecipeApplication.class, args);
        System.out.println("Hello");

    }

}
