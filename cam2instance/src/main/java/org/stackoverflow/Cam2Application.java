package org.stackoverflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableProcessApplication("cam2")
public class Cam2Application {

    public static void main(String[] args) {
        SpringApplication.run(Cam2Application.class, args);
    }

}

