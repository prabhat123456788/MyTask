package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	Product save(Product p);
	Product findByPid(int pid);
	List<Product>findByAll();
	int deleteByPid(int pid);
	
}
