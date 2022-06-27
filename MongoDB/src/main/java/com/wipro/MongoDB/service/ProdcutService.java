package com.wipro.MongoDB.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.MongoDB.entity.Product;
import com.wipro.MongoDB.repository.ProductRepository;

@Service
public class ProdcutService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();

	}

	public Optional<Product> getProduct(long id) {
		return productRepository.findById(id);

	}

	public Product save(Product product) {
		return productRepository.save(product);
	}

	public Product update(Product product) {
		return productRepository.save(product);
	}

	public void delete(long id) {
		productRepository.deleteById(id);
	}

}
