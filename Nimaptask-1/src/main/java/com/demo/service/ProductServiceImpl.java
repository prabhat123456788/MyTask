package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService{
 
	private ProductDao pd;
	@Override
	public Product save(Product p) {
		// TODO Auto-generated method stub
		return pd.save(p);
	}
	@Override
	public Product findByPid(int pid) {
		// TODO Auto-generated method stub
		return pd.findByPid(pid);
	}
	@Override
	public List<Product> findByAll() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}
	@Override
	public int deleteByPid(int pid) {
		// TODO Auto-generated method stub
		return pd.deleteByPid(pid);
	}

}
