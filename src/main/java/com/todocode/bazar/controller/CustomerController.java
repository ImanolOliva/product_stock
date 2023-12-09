package com.todocode.bazar.controller;


import com.todocode.bazar.repository.entity.Customer;
import com.todocode.bazar.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;



    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer){
        return this.customerService.createCustomer(customer);
    }



    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Customer> getAllCustomer(){
        return this.customerService.getAllCustomer();
    }


    @GetMapping("/customer/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Optional<Customer> getByIdCustomer(@PathVariable Long id){
        return this.customerService.getAllByIdCustomer(id);
    }

    @DeleteMapping("/customer/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Long id){
         this.customerService.deleteCustomer(id);
    }
    @PutMapping("/customer/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Customer updateCustomer(@PathVariable Long id,@RequestBody Customer customer){
        return  this.customerService.updateCustomerById(id,customer);
    }

}
