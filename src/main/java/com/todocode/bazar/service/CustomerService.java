package com.todocode.bazar.service;

import com.todocode.bazar.controller.dto.CustomerDTO;
import com.todocode.bazar.repository.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomer();

    Optional<Customer> getAllByIdCustomer(Long id);

    void deleteCustomer(Long id);

    Customer updateCustomerById(Long id,Customer customer);
}
