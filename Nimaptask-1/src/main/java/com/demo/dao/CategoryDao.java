package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	
	Category save(Category s);
	Category findByCid(int id);
	List<Category>findAll();
	int deleteByCid(int Cid);
	
	

}
