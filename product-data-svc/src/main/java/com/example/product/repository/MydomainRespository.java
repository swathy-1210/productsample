package com.example.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.product.models.Product;


@Repository
public interface MydomainRespository extends CrudRepository<Product, String>{
	
	/*
	 * Mydomain findByName(String name);
	 * 
	 * List<Listofinfo> getListOfInfoByName(String name);
	 */

}
