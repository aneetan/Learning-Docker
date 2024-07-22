package com.example.dockerize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DockerizeApplication {

    @GetMapping("/msg")
    public String getMessage(){
        return "Hello from java!! ";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerizeApplication.class, args);
    }

}
