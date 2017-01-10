package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by pierre on 10/01/2017.
 */
@Component
public class Runner implements CommandLineRunner {

    private HealthClient healthClient;

    @Autowired
    public Runner(HealthClient healthClient) {
        this.healthClient = healthClient;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(healthClient.health());
    }
}
