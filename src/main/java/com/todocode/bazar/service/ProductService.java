package com.todocode.bazar.service;

import com.todocode.bazar.controller.dto.ProductDTO;
import com.todocode.bazar.repository.entity.Product;

import java.util.List;

public interface ProductService {

    Product productCreate (Product product);

    List<ProductDTO> getAllProduct();

    ProductDTO getByIdProduct (Long id);

    Boolean deleteProduct(Long id);

    ProductDTO editProduct (Product product);





}
