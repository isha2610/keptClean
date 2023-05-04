package com.project.major.Entity;

import lombok.Getter;
import lombok.Setter;
//import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.util.UUID;

//@Slf4j
public class ProductDetails {

    @Getter @Setter
    public BigInteger id;
    public UUID productId;
    public String name;
    public double price;
    public double rating;
    public String imageURL;
}
