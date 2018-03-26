package com.udemy.springmvcrestdemo.api.v1.mapper;

import com.udemy.springmvcrestdemo.api.v1.model.CustomerDTO;
import com.udemy.springmvcrestdemo.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}

