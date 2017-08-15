package com.example.repository;

import com.example.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName")
    @Query(value="SELECT id, first_name, last_name FROM customers ORDER BY first_name, last_name", nativeQuery = true)
    List<Customer> findAllOrderByName();
}
