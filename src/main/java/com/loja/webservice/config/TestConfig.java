package com.loja.webservice.config;

import com.loja.webservice.entities.User;
import com.loja.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User( null, "Maria Brown", "mariabrowns@gmail.com", "99513599", "232365" );
        User u2 = new User( null, "Jao Azevedo", "johnazevds@gmail.com", "99656663", "989653" );
    userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
