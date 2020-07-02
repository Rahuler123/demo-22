package com.example.demoooo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	

}
