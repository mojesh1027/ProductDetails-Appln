package com.mojesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mojesh.model.ProductTaxs;
@Repository
public interface ProductTaxsRepo extends JpaRepository<ProductTaxs, String> {

}
