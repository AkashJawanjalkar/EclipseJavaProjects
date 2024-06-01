package com.org.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.app.model.Category;

public interface CatAppRepository extends JpaRepository<Category, Integer> {


}
