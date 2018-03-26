package com.udemy.springmvcrestdemo.repositories;

import com.udemy.springmvcrestdemo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
