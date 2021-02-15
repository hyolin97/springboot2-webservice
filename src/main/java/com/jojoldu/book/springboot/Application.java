package com.jojoldu.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing

public class Application {
    public static void main(String[] args) {
        System.out.println("error");
        SpringApplication.run(Application.class, args);
    }

}
