package com.cts.product.service;

import java.util.List;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDAO;
import com.cts.product.dao.ProductDAOImpl;


public class ProductServiceImpl implements ProductService{
	
	ProductDAO dao = new ProductDAOImpl();

	public String insertProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.insertProduct(product);
	}

	public String updateProduct(String id, Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(id, product);
	}

	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return dao.getProductById(id);
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		return dao.getProductByName(name);
	}

}
