package com.three.springboot.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long productId;

	@Column(name = "product_category")
	private String productCategory;

	@Column(name = "product_code")
	private String productCode;

	private String title;

	private String description;

	private float price;

	private int stock_count;

	private String deleted;


	public Product() {

	}

	public Product(String productCategory, String productCode, String title, String description, float price,
			int stock_count, String deleted) {
		super();
		this.productCategory = productCategory;
		this.productCode = productCode;
		this.title = title;
		this.description = description;
		this.price = price;
		this.stock_count = stock_count;
		this.deleted = deleted;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock_count() {
		return stock_count;
	}

	public void setStock_count(int stock_count) {
		this.stock_count = stock_count;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCategory=" + productCategory + ", productCode="
				+ productCode + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", stock_count=" + stock_count + ", deleted=" + deleted + "]";
	}
}
