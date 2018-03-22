package com.udemy.springmvcrestdemo.services;

import com.udemy.springmvcrestdemo.api.v1.model.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);
}

