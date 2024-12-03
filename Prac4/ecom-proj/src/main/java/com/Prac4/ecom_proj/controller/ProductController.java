package com.Prac4.ecom_proj.controller;

import com.Prac4.ecom_proj.model.Product;
import com.Prac4.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductByID(@PathVariable int id){
        Product product = productService.getProductByID(id);

        if (product != null){
            return new  ResponseEntity<>(product, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product product){
        Product retProd = productService.updateProduct(id, product);
        if (retProd != null) return new ResponseEntity<>("Updated",HttpStatus.OK);
        else return new ResponseEntity<>("Not found",HttpStatus.BAD_REQUEST);
    }


    @PostMapping("/products")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.addProducts(products);
    }

    @DeleteMapping("/delete-all")
    public void deleteAll(){
        productService.deleteAll();
    }

    @DeleteMapping("product/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        Product retProd = productService.getProductByID(id);
        if (retProd != null){
            productService.deleteById(id);
            return new ResponseEntity<>("Product with the id found and deleted", HttpStatus.OK);
        }
        else return new ResponseEntity<>("Product with this id not found", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("product/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword){
        List<Product> products = productService.searchProducts(keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
