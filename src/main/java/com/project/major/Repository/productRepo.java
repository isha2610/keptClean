package com.project.major.Repository;


import com.project.major.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface productRepo extends CrudRepository<Product, BigInteger> {

    Product save(Product product);
    ArrayList<Product> findAll();
    Product findByproductId(UUID productId);

}
