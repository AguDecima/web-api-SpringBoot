package com.decima.webapi.services;

import java.util.Optional;

import com.decima.webapi.entities.Product;

public interface IProductService {
	Iterable<Product> listAllProduct();
	Optional<Product> getProductById(Integer id);
	Product saveProduct(Product product);
	void deleteProduct(Integer id);
}
