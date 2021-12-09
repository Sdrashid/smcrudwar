package com.three.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.three.springboot.dao.ProductDao;
import com.three.springboot.dao.entity.Product;
import com.three.springboot.exception.ResourceNotFoundException;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Product addProduct(Product product) {
		
		product = productDao.save(product);
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		
		Iterable<Product> daoProduct = productDao.findAll();
		
		for(Product product:daoProduct) {
			products.add(product);
		}
		
		return products;
	}

	@Override
	public Product getProductById(Long id) {
		Product product = productDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "Id", id));
		
		return product;
	}
	
	@Override
	public Product updatePrice(Long id, float price) {
		Product product = productDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "Id", id));
		
		product.setPrice(price);
		
		product = productDao.save(product);
		
		return product;
	}
	
	@Override
	public Product updateStock(Long id, int stock) {
		Product product = productDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "Id", id));
		
		product.setStock_count(stock);
		
		product = productDao.save(product);
		
		return product;
	}
	
	@Override
	public Product deletedProduct(Long id) {
		Product product = productDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "Id", id));
		
		product.setDeleted("YES");
		
		product = productDao.save(product);
		
		return product;
	}
}
