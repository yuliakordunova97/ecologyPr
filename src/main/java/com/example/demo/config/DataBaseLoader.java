package com.example.demo.config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseLoader {

    private IUserRepository repo;

    public DataBaseLoader(IUserRepository repo) {
        this.repo = repo;
    }

    @Bean
    public CommandLineRunner initializeDatabase() {
        return args -> {

            ArrayList<Role> admin = new ArrayList<>();
            admin.add(new Role("ADMIN"));

            User user1 = new User("lviv@gmail.com", "lviv", admin);
            User user2 = new User("drogobych@gmail.com", "drogobych", admin);
            User user3 = new User("zolochiw@gmail.com", "zolochiw", admin);
            User user4 = new User("sambir@gmail.com", "sambir", admin);
            User user5 = new User("stryi@gmail.com", "stryi", admin);
            User user6 = new User("chervonograd@gmail.com", "chervonograd", admin);
            User user7 = new User("yavoriv@gmail.com", "yavoriv", admin);

            repo.saveAll(List.of(user1, user2, user3, user4, user5, user6, user7));

            System.out.println("Database initialized");
        };
    }
}