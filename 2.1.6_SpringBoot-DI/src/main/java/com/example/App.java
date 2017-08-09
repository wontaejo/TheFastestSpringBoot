package com.example;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... strings) {
        // 데이터 추가
        customerRepository.save(new Customer(1, "Nobita", "Nobi"));
        customerRepository.save(new Customer(2, "Takeshi", "Goda"));
        customerRepository.save(new Customer(3, "Suneo", "Honekawa"));

        // 데이터 표시
        customerRepository.findAll().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
