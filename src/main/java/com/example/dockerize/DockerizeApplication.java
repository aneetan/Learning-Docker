package com.example.dockerize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DockerizeApplication {

    @Autowired
    private JdbcTemplate jdbc;

    @GetMapping("/msg")
    public String getMessage(){
        return "Hello from java!! ";
    }

    @GetMapping("/checkdb")
    public String checkDatabaseConnection() {
        try {
            jdbc.execute("SELECT 1");
            return "Database connected successfully!";
        } catch (Exception e) {
            return "Database connection failed: " + e.getMessage();
        }
    }


    public static void main(String[] args) {
        SpringApplication.run(DockerizeApplication.class, args);
    }

}
