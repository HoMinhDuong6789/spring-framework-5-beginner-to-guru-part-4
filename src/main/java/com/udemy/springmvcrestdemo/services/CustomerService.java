package com.udemy.springmvcrestdemo.services;

import com.udemy.springmvcrestdemo.api.v1.mapper.CustomerMapper;
import com.udemy.springmvcrestdemo.api.v1.model.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);
}

