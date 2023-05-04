package com.project.major.Services;

import com.project.major.Entity.Product;
import com.project.major.Repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class productService {

    @Autowired
    productRepo productrepo;
    public Product saveDataToDB(Product product){
        product.setProductId(UUID.randomUUID());
        return productrepo.save(product);
    }

    public ArrayList<Product> findAllProducts(){
        return productrepo.findAll();
    }

    public Product getProductDetails(UUID productId){
        return productrepo.findByproductId(productId);
    }

}
