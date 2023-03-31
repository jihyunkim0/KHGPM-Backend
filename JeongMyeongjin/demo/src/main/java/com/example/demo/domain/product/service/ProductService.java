package com.example.demo.domain.product.service;

import com.example.demo.domain.product.controller.dto.*;
import com.example.demo.domain.product.entity.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    void register(List<MultipartFile> fileList,
                  RequestProductInfo productRequest);

    List<ProductListResponse> list();

    ProductReadResponse read(Long productId);

    void remove(Long productId);

    Product modify(Long productId, ProductRequest productRequest);

    List<ImageResourceResponse> findProductImage(Long productId);
}