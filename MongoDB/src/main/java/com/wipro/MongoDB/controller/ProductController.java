package com.wipro.MongoDB.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.MongoDB.entity.Product;
import com.wipro.MongoDB.service.ProdcutService;

@RestController
public class ProductController {

	@Autowired
	private ProdcutService prodcutService;

	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return prodcutService.getAllProducts();

	}

	@GetMapping("/product/{id}")
	public Optional<Product> getProduct(@PathVariable long id) {
		return prodcutService.getProduct(id);

	}

	@PostMapping("/product")
	public Product save(@RequestBody Product product) {
		return prodcutService.save(product);
	}

	@PutMapping("/product")
	public Product update(@RequestBody Product product) {
		return prodcutService.update(product);
	}

	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable long id) {
		prodcutService.delete(id);
	}

}
