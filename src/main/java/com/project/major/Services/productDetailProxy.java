package com.project.major.Services;

import com.project.major.Entity.ProductDetails;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.UUID;


//@FeignClient(name = "product-details", url = "localhost:8082")
public interface productDetailProxy {

    @GetMapping("/keptClean/products/search/{productId}")
    public ProductDetails getProductById(@PathVariable UUID productId);
}
