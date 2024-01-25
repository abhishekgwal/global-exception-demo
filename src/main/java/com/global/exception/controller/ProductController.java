package com.global.exception.controller;

import com.global.exception.model.Product;
import com.global.exception.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/getProduct")
    public Product getProductDataById(@RequestParam("id") String id) {
        return productService.findProductById(Integer.parseInt(id));
    }
}
