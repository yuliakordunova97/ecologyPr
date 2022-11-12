//package com.example.demo.config;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import com.example.demo.model.Role;
//import com.example.demo.model.User;
//import com.example.demo.repository.IUserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DataBaseLoader {
//
//    private IUserRepository repo;
//
//    public DataBaseLoader(IUserRepository repo) {
//        this.repo = repo;
//    }
//
//    @Bean
//    public CommandLineRunner initializeDatabase() {
//        return args -> {
//
//            ArrayList<Role> admin = new ArrayList<>();
//            admin.add(new Role("ADMIN"));
//
//            User user1 = new User("david@gmail.com", "david123", admin);
//            User user2 = new User("john@yahoo.com", "john2020", admin);
//            User user3 = new User("nam@codejava.net", "nam2022", admin);
//            User user4 = new User("ravi@gmail.com", "ravi2121", admin);
//
//            repo.saveAll(List.of(user1, user2, user3, user4));
//
//            System.out.println("Database initialized");
//        };
//    }
//}