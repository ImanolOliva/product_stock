package com.todocode.bazar.service.impl;


import com.todocode.bazar.exceptions.ExceptionsCustom;
import com.todocode.bazar.exceptions.NotFoundCustomer;
import com.todocode.bazar.exceptions.NotFoundProduct;
import com.todocode.bazar.exceptions.NotFoundSale;
import com.todocode.bazar.repository.CustomerRepository;
import com.todocode.bazar.repository.ProductRepository;
import com.todocode.bazar.repository.SaleRepository;
import com.todocode.bazar.repository.entity.Customer;
import com.todocode.bazar.repository.entity.Product;
import com.todocode.bazar.repository.entity.Sale;
import com.todocode.bazar.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {


    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductServiceImpl productService;

    @Override
    public Sale createSale(Sale sale) throws ExceptionsCustom {
        sale.setSaleDate(new Date());
        Optional<Customer> customer = this.customerRepository.findById(sale.getCustomer().getId());
        if (customer == null) {
            throw new NotFoundCustomer("not.found.customer");
        }
        sale.setProductList(this.productService.getAllProduct());
        sale.setTotal(sale.getTotal());
        sale.setState(true);

        return this.saleRepository.save(sale);
     }

    @Override
    public List<Sale> getAllSales() throws ExceptionsCustom {
           List<Sale> saleList = this.saleRepository.findAll();
           if(saleList.isEmpty()){
               throw  new NotFoundSale("not.found.list");
           }
           return saleList;
    }

    @Override
    public Optional<Sale> getByIdSale(Long id) throws ExceptionsCustom {
        Optional<Sale> sale =  this.saleRepository.findById(id);
        if(sale == null){
            throw new NotFoundSale("not.found.sale");
        }
        return sale;
    }

    @Override
    public void deleteById(Long id) {
        Optional <Sale> sale = this.saleRepository.findById(id);
        if(!sale.isEmpty()){
            this.saleRepository.deleteById(id);
        }else{
            throw new NotFoundSale("sale.not.found");
        }

    }

    @Override
    public Sale updateSale(Long id,Sale sale)
    {
        return null;
    }
}
