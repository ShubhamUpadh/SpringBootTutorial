package com.Prac3.simpleWebApp.service;

import com.Prac3.simpleWebApp.model.Product;
import com.Prac3.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"IPhone",5000),
//            new Product(102,"Samsung",1500),
//            new Product(103, "Mi",4000)));
    @Autowired
    ProductRepo productRepo;

    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(int id){
        return productRepo.findById(id);
    }

    public Product addProduct(Product prod) {
        return productRepo.save(prod);
    }

    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }

    public void deleteProduct(int prodId) {
        productRepo.deleteById(prodId);
    }
}
