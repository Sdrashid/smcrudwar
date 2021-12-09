package com.three.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.three.springboot.dao.entity.Product;
import com.three.springboot.service.ProductService;

@RestController
@RequestMapping("/smcrudwar/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/all-products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable("productId") Long productId){
		return productService.getProductById(productId);
	}
	
	@PostMapping(path = "/addProduct")
	public ResponseEntity<Product> addOrder(@RequestBody Product Product){
		return new ResponseEntity<Product>(productService.addProduct(Product),HttpStatus.CREATED);
	}
	
	@PostMapping(path = "/updatePrice/{productId}/{price}")
	public ResponseEntity<Product> updatePrice(@PathVariable("productId") Long productId, 
			@PathVariable("price") float price) {
		return new ResponseEntity<Product>(productService.updatePrice(productId, price),HttpStatus.OK);
	}
	
	@PostMapping(path = "/updateStock/{productId}/{stock}")
	public ResponseEntity<Product> updateStock(@PathVariable("productId") Long productId, 
			@PathVariable("stock") int stock) {
		return new ResponseEntity<Product>(productService.updateStock(productId, stock),HttpStatus.OK);
	}
	
	@PostMapping(path = "/deleteStock/{productId}")
	public ResponseEntity<Product> deletedProduct(@PathVariable("productId") Long productId) {
		return new ResponseEntity<Product>(productService.deletedProduct(productId),HttpStatus.OK);
	}

}
