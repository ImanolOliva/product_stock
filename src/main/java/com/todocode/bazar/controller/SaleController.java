package com.todocode.bazar.controller;


import com.todocode.bazar.repository.entity.Customer;
import com.todocode.bazar.repository.entity.Product;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class SaleController {


    private Long id;

    private LocalDate saleDate;

    private Integer total;

    @OneToMany
    private List<Product> productList;

    @OneToOne
    private Customer customer;

}
