package com.todocode.bazar.repository;


import com.todocode.bazar.repository.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,Long> {
}
