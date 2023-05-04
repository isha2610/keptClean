package com.project.major.controller;

import com.project.major.Entity.Cart;
import com.project.major.Entity.CartDetails;
import com.project.major.Services.addToCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/keptClean/addToCart")
public class addToCartController {

    @Autowired
    addToCartService addtocartservice;
    @PostMapping("/add")
    public void addToCart(@RequestBody Cart cart){
        addtocartservice.addItemToCartService(cart);
    }

    @DeleteMapping("/remove")
    public void removeFromCart(@RequestBody Cart cart){
        addtocartservice.removeItemFromCartService(cart);
    }
    
    @GetMapping("/show/{userId}")
    public CartDetails showItems(@PathVariable UUID userId){
        return addtocartservice.displayAllProductsInCart(userId);
    }

}