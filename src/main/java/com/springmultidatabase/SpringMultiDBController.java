package com.springmultidatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmultidatabase.pojo.ProductDTO;
import com.springmultidatabase.service.ProductService;

@RestController
@RequestMapping("/v1/api/product")
public class SpringMultiDBController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/addproddetails")
	public ResponseEntity<ProductDTO> addProductDetails(@RequestBody ProductDTO productDTO) {
		this.productService.addProductDetails(productDTO);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{productid}")
	public ResponseEntity<ProductDTO> getProductDetails(@PathVariable int productid) {
		ProductDTO productDTO = this.productService.getProductDetails(productid);
		return new ResponseEntity<>(productDTO,HttpStatus.OK);
	}

}
