package com.mojesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mojesh.model.ProductDetails;
import com.mojesh.service.ProductServiceImp;

@RestController
public class ProductContoller {
	
	@Autowired
	private ProductServiceImp service;
	
	@PostMapping("/save")
	public ProductDetails saveProduct(@RequestBody ProductDetails pdt) {
		ProductDetails pr1=service.savedetails(pdt);
		return pr1;
	}
	
	@GetMapping("/get/{pid}")
	public ProductDetails getproduct(@PathVariable String pcategery) {
		ProductDetails pd=service.getdetails(pcategery);
		return pd;
		}
}
