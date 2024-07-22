package com.example.dockerize.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class CheckDB {

    @Autowired
    private JdbcTemplate jdbc;


    @GetMapping("/checkdb")
    public String checkDatabaseConnection() {
        try {
            jdbc.execute("SELECT 1");
            return "Database connected successfully!";
        } catch (Exception e) {
            return "Database connection failed: " + e.getMessage();
        }
    }
}
