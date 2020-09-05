package com.example.product.repository;

import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.example.product.models.Product;


@Repository
public interface MyDomainReactiveRepository extends ReactiveCouchbaseRepository<Product, String>{
	
	

}
