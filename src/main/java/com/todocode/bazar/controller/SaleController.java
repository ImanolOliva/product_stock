package com.todocode.bazar.controller;


import com.todocode.bazar.repository.entity.Customer;
import com.todocode.bazar.repository.entity.Product;
import com.todocode.bazar.repository.entity.Sale;
import com.todocode.bazar.service.SaleService;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("sale")
public class SaleController {



    @Autowired
    private SaleService saleService;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Sale createSale(@RequestBody Sale sale){
        return this.saleService.createSale(sale);
    }


    @GetMapping("/sales")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Sale> getAllSales(){
        return this.saleService.getAllSales();
    }


    @GetMapping("/sales/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Optional<Sale> getByIdSale(@PathVariable Long id){
        return this.saleService.getByIdSale(id);
    }


    @DeleteMapping("/sales/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Long id){
         this.saleService.deleteById(id);
    }



}
