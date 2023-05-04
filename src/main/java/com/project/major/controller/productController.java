package com.project.major.controller;

import com.project.major.Entity.Product;
import com.project.major.Services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/keptClean/products")
public class productController {

    @Autowired
    productService productservice;
    @PostMapping("/save")
    public Product saveData(@RequestBody Product product){
        return productservice.saveDataToDB(product);
    }

    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts(){
        return productservice.findAllProducts();
    }

    @GetMapping("/search/{productId}")
    public Product getProductById(@PathVariable UUID productId){
        return productservice.getProductDetails(productId);
    }

}
