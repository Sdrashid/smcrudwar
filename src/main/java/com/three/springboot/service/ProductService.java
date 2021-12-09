package com.three.springboot.service;

import java.util.List;

import com.three.springboot.dao.entity.Product;


public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(Long id);
	
	public Product updatePrice(Long id, float price);
	
	public Product updateStock(Long id, int stock);
	
	public Product deletedProduct(Long id);
}
