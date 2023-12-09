package com.todocode.bazar.service;

import com.todocode.bazar.controller.dto.ProductDTO;
import com.todocode.bazar.repository.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product productCreate (Product product);

    List<Product> getAllProduct();

    Optional<Product> getByIdProduct (Long id);

    void deleteProduct(Long id);

    Product editProduct (Long id,Product product);





}
