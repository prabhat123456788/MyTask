package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryDao;
import com.demo.model.Category;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements  CategoryService {

	@Autowired
	private CategoryDao cd;

	@Override
	public Category save(Category c) {
		// TODO Auto-generated method stub
		return cd.save(c);
	}

	@Override
	public Category findByCid(int id) {
		// TODO Auto-generated method stub
		return cd.findByCid(id);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cd.findAll();
	}

	@Override
	public int deleteByCid(int Cid) {
		// TODO Auto-generated method stub
		return cd.deleteByCid(Cid);
	}

	

	
}
