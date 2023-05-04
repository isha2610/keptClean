package com.project.major.config;

import com.project.major.Entity.ProductDetails;
import com.project.major.Services.productDetailProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class config {

        @Bean
        // Here the method name is the
        // bean id/bean name
        public productDetailProxy collegeBean() {

            // Return the College object
            return new productDetailProxy() {
                @Override
                public ProductDetails getProductById(UUID productId) {
                    return null;
                }
            };
        }
    }

