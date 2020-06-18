package com.github.pcrawler.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ManageStarter {
    public static void main(String[] args) {
        SpringApplication.run(ManageStarter.class, args);
    }
}
