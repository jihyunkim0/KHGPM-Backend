package com.example.demo.domain.product.repository;

import com.example.demo.domain.product.entiity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
