package com.example.mysb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MysbApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MysbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
