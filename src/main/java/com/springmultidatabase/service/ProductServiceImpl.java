package com.springmultidatabase.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmultidatabase.Entity.Product;
import com.springmultidatabase.pojo.ProductDTO;
import com.springmultidatabase.repository.ProductRepository;


@Service
public class ProductServiceImpl  implements ProductService{
	
	
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProductDetails(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		
		product.setProductcategory(productDTO.getProductcategory());
		product.setProductcount(productDTO.getProductcount());
		product.setProductdesc(productDTO.getProductdesc());
		product.setProductid(productDTO.getProductid());
		product.setProductname(productDTO.getProductname());
		productRepository.save(product);
		
	}

	@Override
	public ProductDTO getProductDetails(int productid) {
		// TODO Auto-generated method stub
		Optional<Product> product  = productRepository.findById(productid);
		ProductDTO productDTO = new ProductDTO ();
		productDTO.setProductcategory(product.get().getProductcategory());
		productDTO.setProductcount(product.get().getProductcount());
		productDTO.setProductdesc(product.get().getProductdesc());
		productDTO.setProductid(product.get().getProductid());
		productDTO.setProductname(product.get().getProductname());
		return productDTO; 
	}

}
