package com.example.demo.domain.product.service;

import com.example.demo.domain.product.controller.request.ProductRequest;
import com.example.demo.domain.product.entiity.Product;

import java.util.List;

public interface ProductService {
    void register(ProductRequest productRequest);

    List<Product> list();

    Product read(Long productId);

    void remove(Long productId);

}
