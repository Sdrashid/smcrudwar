package com.three.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.three.springboot.dao.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Long>{

}
