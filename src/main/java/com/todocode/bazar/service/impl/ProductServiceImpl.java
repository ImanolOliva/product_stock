package com.todocode.bazar.service.impl;


import com.todocode.bazar.controller.dto.ProductDTO;
import com.todocode.bazar.exceptions.ExceptionsCustom;
import com.todocode.bazar.repository.ProductRepository;
import com.todocode.bazar.repository.entity.Product;
import com.todocode.bazar.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product productCreate(Product product) throws RuntimeException{
        this.productRepository.save(product);
        return product;
    }

    @Override
    public List<ProductDTO> getAllProduct() {
        return null;
    }

    @Override
    public ProductDTO getByIdProduct(Long id) {
        return null;
    }

    @Override
    public Boolean deleteProduct(Long id) {
        return null;
    }

    @Override
    public ProductDTO editProduct(Product product) {
        return null;
    }
}
