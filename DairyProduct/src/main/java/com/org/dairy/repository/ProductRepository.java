package com.org.dairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.dairy.model.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
