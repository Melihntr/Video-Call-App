package com.vod.backend.voice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vod.backend.voice.entity.User;
import com.vod.backend.voice.service.UserService;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserService service) {
        return args -> {
            service.register(User.builder()
                    .username("user1")
                    .email("user1@gmail.com")
                    .password("password1")
                    .build());

            service.register(User.builder()
                    .username("user2")
                    .email("user2@gmail.com")
                    .password("password2")
                    .build());

            service.register(User.builder()
                    .username("user3")
                    .email("user3@gmail.com")
                    .password("password3")
                    .build());
        };
    }
}
