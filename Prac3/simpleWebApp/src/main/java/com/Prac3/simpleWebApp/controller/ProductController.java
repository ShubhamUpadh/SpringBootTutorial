package com.Prac3.simpleWebApp.controller;

import com.Prac3.simpleWebApp.model.Product;
import com.Prac3.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductByID(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product prod){
        return productService.addProduct(prod);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        System.out.println("Here @ controller class");
        return productService.updateProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public Product deleteProduct(@PathVariable int prodId){
        return productService.deleteProduct(prodId);
    }
}
