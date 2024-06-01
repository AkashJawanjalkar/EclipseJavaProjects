package com.org.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.model.Category;
import com.org.app.model.Product;
import com.org.app.repo.CatAppRepository;

@RestController
@RequestMapping("/api/categories/")
public class DairyCon {

	@Autowired
	CatAppRepository catAppRepository;

	@PostMapping
	public Category addCategory(@RequestBody Category category) {

		System.out.println(category);
		category.getCategoryBrand();
		return catAppRepository.save(category);
	}

	@GetMapping("fechcatgory")
	public List<Category> getCategory() {
		return catAppRepository.findAll();

	}

	@GetMapping("{id}")
	public Optional<Category> getCategoryById(@PathVariable("id") Integer id) {
	

		return  catAppRepository.findById(id);
	}

	@PutMapping("udpateCategory/{id}")
	public boolean CategoryRecords(@RequestBody Category category, @PathVariable("id") int id) throws AttributeNotFoundException {

		   Category c = catAppRepository.findById(id)
	                .orElseThrow(() -> new AttributeNotFoundException("Employee not exist with id: " + id));

		      c.setCategoryBrand(category.getCategoryBrand());
		      c.setCategoryName(category.getCategoryName());
		      c.setPlist(category.getPlist());
			catAppRepository.save(c);
			return true;
		
	}

	@DeleteMapping("/deletecategory/{id}")
	public String deleteCategoryRecords(@PathVariable("id") int id) {
		try {
			catAppRepository.deleteById(id);
			return "data are deleted ";
		} catch (Exception e) {
			System.out.println(e);
		}
		return "data not deleted";

	}
}
