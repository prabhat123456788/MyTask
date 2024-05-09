package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	Product save(Product p);
	Product findByPid(int pid);
	List<Product>findByAll();
	int deleteByPid(int pid);
	

}
