package com.todocode.bazar.controller.dto;

import com.todocode.bazar.repository.entity.Customer;
import com.todocode.bazar.repository.entity.Product;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.time.LocalDate;
import java.util.List;

public class SaleDTO {

    private Long id;

    private LocalDate saleDate;

    private Integer total;


    private List<Product> productList;


    private Customer customer;

    private Boolean state;
}
