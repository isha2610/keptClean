package com.project.major.Services;

import com.project.major.Entity.Cart;
import com.project.major.Entity.CartDetails;
import com.project.major.Entity.Product;
import com.project.major.Entity.ProductDetails;
import com.project.major.Repository.addToCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.major.Services.productDetailProxy;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class addToCartService {

    @Autowired
    addToCartRepo addtocartrepo;

    @Autowired
    productDetailProxy productdetailproxy;
    public void addItemToCartService(Cart cart){
        addtocartrepo.save(cart);
    }

    public void removeItemFromCartService(Cart cart){
        addtocartrepo.delete(cart);
    }

    public CartDetails displayAllProductsInCart(UUID userId){
        CartDetails cartdetails = new CartDetails();
        cartdetails.setUserId(userId);

        ArrayList<Cart> cartlist = addtocartrepo.findByUserId(userId);
//        ArrayList<Cart> cartlist = null;
        ArrayList<ProductDetails> productList = new ArrayList<ProductDetails>();

        for(int i=0;i<cartlist.size();i++){
            ProductDetails product = productdetailproxy.getProductById(cartlist.get(i).getProductId());
            productList.add(product);
        }

        cartdetails.setList(productList);

        return cartdetails;
    }
}
