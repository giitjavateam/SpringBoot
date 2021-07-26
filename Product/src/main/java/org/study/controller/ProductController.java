package org.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.study.model.Product;
import org.study.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
@RequestMapping("/product")
	public List<Product> getProduct() {
		return service.getProduct();
		
	} 
@RequestMapping("/product/{id}")
public Product getProduct(@PathVariable int id ) {
	return service.getProduct(id);
	
}
@RequestMapping(method=RequestMethod.POST,value="/product")
public void addProduct(@RequestBody Product listElement) {
	 service.addProduct(listElement);
}
@RequestMapping(method=RequestMethod.PUT,value="/product/{id}")
public void updateProduct(@RequestBody Product product) {
	service.updateProduct(product);
}
@RequestMapping(method=RequestMethod.DELETE,value="/product/{id}")
public void deleteProduct(@PathVariable int id) {
	service.deleteProduct(id);
}
}
