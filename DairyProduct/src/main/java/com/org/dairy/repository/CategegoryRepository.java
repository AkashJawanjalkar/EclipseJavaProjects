package com.org.dairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.dairy.model.Category;

public interface CategegoryRepository extends JpaRepository<Category, Integer> {
	
	

}
