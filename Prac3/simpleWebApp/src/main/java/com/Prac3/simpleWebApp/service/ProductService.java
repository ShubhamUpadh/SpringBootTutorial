package com.Prac3.simpleWebApp.service;

import com.Prac3.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"IPhone",5000),
            new Product(102,"Samsung",1500),
            new Product(103, "Mi",4000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int id){
        for (Product product : products){
            if (product.getProdID() == id){
                return product;
            }
        }
        return null;
    }

    public Product addProduct(Product prod) {
        products.add(prod);
        return prod;
    }

    public Product updateProduct(Product product) {
        System.out.println("here @ service class");
        for (Product prod : products){
            if (prod.getProdID() == product.getProdID()){
                prod.setProdName(product.getProdName());
                prod.setPrice(product.getPrice());
                return prod;
            }
        }
        //return null;
        return new Product(-1,"Not found",404);
    }

    public Product deleteProduct(int prodId) {
        for (Product prod : products){
            if (prod.getProdID() == prodId){
                products.remove(prod);
                return new Product(-1,"Removed",200);
            }
        }
        return new Product(-1,"Not found",404);
    }
}
