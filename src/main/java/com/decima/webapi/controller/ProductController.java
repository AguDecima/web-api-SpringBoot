package com.decima.webapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decima.webapi.entities.Product;
import com.decima.webapi.services.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product")
	public Product save(@RequestBody Product product) {
		productService.saveProduct(product);
		return product;
	}
	
	@GetMapping("/products")
	public Iterable<Product> getAll()
	{
		return productService.listAllProduct();
	}
	
	@GetMapping("/products/{id}")
	public Optional<Product> getById(@PathVariable Integer id)
	{
		return productService.getProductById(id);
	}
	
	
}
