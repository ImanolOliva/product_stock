package com.todocode.bazar.repository;


import com.todocode.bazar.controller.dto.ProductDTO;
import com.todocode.bazar.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product,Long> {
}
