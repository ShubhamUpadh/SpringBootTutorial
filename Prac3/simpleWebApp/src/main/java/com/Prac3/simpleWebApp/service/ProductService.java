package com.Prac3.simpleWebApp.service;

import com.Prac3.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"IPhone",5000),
            new Product(102,"Samsung",1500),
            new Product(103, "Mi",4000));

    public List<Product> getProducts(){
        return products;
    }
}
