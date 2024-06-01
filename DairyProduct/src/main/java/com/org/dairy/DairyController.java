package com.org.dairy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dairy.model.Category;
import com.org.dairy.repository.CategegoryRepository;

@RestController
public class DairyController {

	@Autowired
	CategegoryRepository categegoryRepository;

	@GetMapping("/save")
	public Category addcat() {

		Category c = new Category();
		c.setCategoryBrand("Amul");
		c.setCategoryName("Milk");

		return categegoryRepository.save(c);

	}
	@GetMapping("/test")
	public String testApi()
	{
		return "Activated ....";
	}

}
