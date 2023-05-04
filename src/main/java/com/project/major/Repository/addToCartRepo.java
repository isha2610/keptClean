package com.project.major.Repository;

import com.project.major.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface addToCartRepo extends JpaRepository<Cart, Long> {

    Cart save(Cart cart);
    void delete(Cart cart);

    ArrayList<Cart> findByUserId(UUID userId);
}
