package com.mojesh.service;

import com.mojesh.model.ProductDetails;

public interface ProductServiceDetails {
		public ProductDetails  savedetails(ProductDetails product);
		public ProductDetails getdetails( String pcategery);
}
