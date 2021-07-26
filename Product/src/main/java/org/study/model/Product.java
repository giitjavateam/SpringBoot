package org.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="productName")
	private String productName;
	@Column(name="category")
	private String category;
	
	public Product() {
	
	}

	public Product(int id, String productName, String category) {
		this.id = id;
		this.productName = productName;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
