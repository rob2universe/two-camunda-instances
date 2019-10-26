package org.camunda.stackoverflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableProcessApplication("cam1")
public class Cam1Application {

    public static void main(String[] args) {
        SpringApplication.run(Cam1Application.class, args);
    }

}

