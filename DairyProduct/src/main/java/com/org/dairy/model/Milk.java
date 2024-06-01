package com.org.dairy.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//@Entity
public class Milk {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MilkId;
	private String Name;
	private int price;
	private String ManufactureDate;
	private String ExpiryDate;

	@OneToMany(mappedBy = "CategoryId")
	private List<Category> categories;

	public int getMilkId() {
		return MilkId;
	}

	public void setMilkId(int milkId) {
		MilkId = milkId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		ManufactureDate = manufactureDate;
	}

	public String getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}

//	public List<Category> getCategories() {
//		return categories;
//	}
//
//	public void setCategories(List<Category> categories) {
//		this.categories = categories;
//	}

	public Milk(int milkId, String name, int price, String manufactureDate, String expiryDate,
			List<Category> categories) {

		MilkId = milkId;
		Name = name;
		this.price = price;
		ManufactureDate = manufactureDate;
		ExpiryDate = expiryDate;
		// this.categories = categories;
	}

	public Milk() {

	}

}
