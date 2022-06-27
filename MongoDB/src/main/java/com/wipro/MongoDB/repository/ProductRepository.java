package com.wipro.MongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.MongoDB.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {

}
