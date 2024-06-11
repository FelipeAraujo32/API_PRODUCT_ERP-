package com.product.product_api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.product_api.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID>{
}
