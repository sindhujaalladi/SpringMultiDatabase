package com.springmultidatabase.service;

import com.springmultidatabase.pojo.ProductDTO;

public interface ProductService {
	
	
	
	void addProductDetails(ProductDTO productDTO);
	
	ProductDTO getProductDetails(int productid);

}
