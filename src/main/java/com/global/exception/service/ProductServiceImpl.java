package com.global.exception.service;

import com.global.exception.exception.NoProductFoundException;
import com.global.exception.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Product findProductById(Integer id) {

        if (id == 101)
            return new Product("101", "Keyboard", 800.00);
        else
            throw new NoProductFoundException("No Product Found");
    }
}
