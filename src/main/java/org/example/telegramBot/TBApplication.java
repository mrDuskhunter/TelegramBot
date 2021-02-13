package org.example.telegramBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class TBApplication {
    public static void main(String[] args) {
        ApiContextInitializer.init();

        SpringApplication.run(TBApplication.class, args);
    }
}
