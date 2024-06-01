package com.org.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.app.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
