package com.todocode.bazar.controller;


import com.todocode.bazar.controller.dto.ProductDTO;
import com.todocode.bazar.repository.entity.Product;
import com.todocode.bazar.service.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("product")
public class ProductController {


    @Autowired
    private ProductServiceImpl productServiceImpl;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@RequestBody Product product){
       return this.productServiceImpl.productCreate(product);
    }


    @GetMapping("/products")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Product> getAllProducts(){
           return this.productServiceImpl.getAllProduct();
    }

    @GetMapping("/products/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Optional<Product> getByIdProduct(@PathVariable Long id){
        return this.productServiceImpl.getByIdProduct(id);
    }



    @DeleteMapping("/products/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteProductById(@PathVariable Long id){

        this.productServiceImpl.deleteProduct(id);
    }


    @PutMapping("/products/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
       return this.productServiceImpl.editProduct(id,product);
    }

}
