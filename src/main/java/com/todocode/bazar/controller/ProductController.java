package com.todocode.bazar.controller;


import com.todocode.bazar.controller.dto.ProductDTO;
import com.todocode.bazar.repository.entity.Product;
import com.todocode.bazar.service.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("product")
public class ProductController {


    @Autowired
    private ProductServiceImpl productServiceImpl;



    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) throws RuntimeException{
        this.productServiceImpl.productCreate(product);
        return ResponseEntity.ok(product);
    }

}
