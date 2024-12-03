package com.Prac4.ecom_proj.service;

import com.Prac4.ecom_proj.model.Product;
import com.Prac4.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public List<Product> addProducts(List<Product> products) {
        return productRepo.saveAll(products);
    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }

    public void deleteAll() {
        productRepo.deleteAll();
    }

    public Product getProductByID(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product updateProduct(int id, Product product) {
        return productRepo.save(product);
    }

    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return productRepo.searchProducts(keyword);
    }
}
