package com.Prac3.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int prodID;
    private String prodName;
    private int price;
}
