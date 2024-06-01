package com.org.app.controller;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.model.Product;
import com.org.app.repo.ProductRepo;

@RestController
@RequestMapping("/api/product/")
public class ProductCotroller {

	@Autowired
	ProductRepo productRepo;

	@PostMapping("saveProduct")
	public Product save(@RequestBody Product p) {

		return productRepo.save(p);
	}

	@GetMapping("fechproduct")
	public List<Product> fechProduct() {
		return productRepo.findAll();
	}

	@GetMapping("/productbyid/{id}")
	public Optional<Product> fectchbyProductRecord(@PathVariable("id") int id) {
		return productRepo.findById(id);

	}

	@PutMapping("updatebyId/{id}")
	public Product updateProductById(@RequestBody Product product, @PathVariable("id") int id) throws AttributeNotFoundException {
		Product p =  productRepo.findById(id)
                .orElseThrow(() -> new AttributeNotFoundException("Employee not exist with id: " + id));

	
			p.setExpirydate(product.getExpirydate());
			p.setManufactureDate(product.getManufactureDate());
			p.setProductName(product.getProductName());
			p.setProductPrice(product.getProductPrice());
			p.setProductId(product.getProductId());
		
		return productRepo.save(p);

	}
	@DeleteMapping("deleteproduct/{id}/")
	 public String deleteProductById(@PathVariable("id") int id)
	 {
		 try {
			 productRepo.deleteById(id);
			 return  "id"+id+" is a Deleted..";
		 }catch (Exception e) {
			 System.out.println(e);
		}
		 return  "id"+id+" is a not Deleted..";
	 }

}
