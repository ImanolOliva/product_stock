package com.todocode.bazar.service.impl;


import com.todocode.bazar.controller.dto.ProductDTO;
import com.todocode.bazar.exceptions.ExceptionsCustom;
import com.todocode.bazar.exceptions.NotFoundProduct;
import com.todocode.bazar.repository.ProductRepository;
import com.todocode.bazar.repository.entity.Product;
import com.todocode.bazar.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product productCreate(Product product){

        if(product.getName() == null || product.getTradeMark()  == null ||
          product.getCost()  == null || product.getQuantityAvailable() == null ){
            throw  new NotFoundProduct("not.found.product");
        }
        product.setState(true);
        this.productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> list = this.productRepository.findAll();
        if(list.isEmpty()){
            throw new RuntimeException("list.contain.not.product");
        }
        return list;
    }

    @Override
    public Optional<Product> getByIdProduct(Long id) throws ExceptionsCustom {
       Optional<Product> product = this.productRepository.findById(id);
       if(product.isEmpty() || product == null){
           throw new NotFoundProduct("produc.not.found");
       }
       return  product;
    }

    @Override
    public void deleteProduct(Long id) throws ExceptionsCustom {
        Optional <Product> product = this.productRepository.findById(id);
         if(!product.isEmpty()){
             this.productRepository.deleteById(id);
         }else{
             throw new  NotFoundProduct("product.not.found");
         }

    }




    public Product editProduct(Long id, Product productDTO) throws RuntimeException {

        Optional<Product> product =  this.productRepository.findById(id);

         product.get().setName(productDTO.getName());
         product.get().setCost(productDTO.getCost());
         product.get().setTradeMark(productDTO.getTradeMark());
         product.get().setState(productDTO.getState());
         product.get().setQuantityAvailable(productDTO.getQuantityAvailable());

         this.productRepository.save(product.get());

         return productDTO;
    }
}
