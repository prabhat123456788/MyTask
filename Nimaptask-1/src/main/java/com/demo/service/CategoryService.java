package com.demo.service;

import java.util.List;

import com.demo.model.Category;

public interface CategoryService {
	
	Category save(Category s);
	Category findByCid(int id);
	List<Category>findAll();
	int deleteByCid(int Cid);
}
