package com.org.dairy.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity
public class Bekary {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BekaryId;
   private String Name;
   private int Price;
   private String ManufactureDate;
   private String ExpiryDate;
   
	
}
