package com.project.major.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.UUID;

//@Slf4j
@Getter @Setter
public class CartDetails {

    private UUID userId;
    private ArrayList<ProductDetails> list;
}
