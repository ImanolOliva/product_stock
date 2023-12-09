package com.todocode.bazar.service.impl;


import com.todocode.bazar.controller.dto.CustomerDTO;
import com.todocode.bazar.exceptions.ExceptionsCustom;
import com.todocode.bazar.exceptions.NotFoundCustomer;
import com.todocode.bazar.repository.CustomerRepository;
import com.todocode.bazar.repository.entity.Customer;
import com.todocode.bazar.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) throws RuntimeException {
        if(customer.getName() == null || customer.getLastName() == null){
            throw new NotFoundCustomer("not.found.customer");
        }
        customer.setState(true);
        this.customerRepository.save(customer);
        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() throws RuntimeException  {
       List<Customer> list = this.customerRepository.findAll();
       if(list.isEmpty()){
           throw  new NotFoundCustomer("customer list not found");
       }
       return list;
    }

    @Override
    public Optional<Customer> getAllByIdCustomer(Long id) throws RuntimeException {
        Optional<Customer> customer = this.customerRepository.findById(id);
        if(customer == null || customer.isEmpty()){
            throw  new NotFoundCustomer("customer.not.found");
        }
        return customer;
    }


    @Override
    public void deleteCustomer(Long id) throws  RuntimeException{
      Optional<Customer> customer =  this.customerRepository.findById(id);
      if(customer == null || customer.isEmpty()){
          throw  new NotFoundCustomer("customer not found");
      }
      this.customerRepository.deleteById(customer.get().getId());
    }


    @Override
    public Customer updateCustomerById(Long id, Customer customer)  throws RuntimeException{
        Optional <Customer> customerReponse = this.customerRepository.findById(id);
        customerReponse.get().setName(customer.getName());
        customerReponse.get().setLastName(customer.getLastName());
        customerReponse.get().setDni(customer.getDni());
        customerReponse.get().setState(customer.getState());

        this.customerRepository.save(customerReponse.get());
        return customer;
    }
}
