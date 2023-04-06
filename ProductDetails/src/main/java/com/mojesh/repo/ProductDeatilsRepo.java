package com.mojesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mojesh.model.ProductDetails;
@Repository
public interface ProductDeatilsRepo extends JpaRepository<ProductDetails, String> {

}
