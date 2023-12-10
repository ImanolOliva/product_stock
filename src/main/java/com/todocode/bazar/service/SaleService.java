package com.todocode.bazar.service;

import com.todocode.bazar.repository.entity.Sale;

import java.util.List;
import java.util.Optional;

public interface SaleService {


    Sale createSale (Sale sale);


    List<Sale> getAllSales();

    Optional<Sale> getByIdSale(Long id);


    void deleteById(Long id);


    Sale updateSale(Long id,Sale sale);

}
