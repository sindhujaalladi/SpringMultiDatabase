package com.springmultidatabase.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Product")
public class Product {
	
	
	@Id
	private int productid;
	
	@Column(name = "ProductName")
	private String productname;
	
	@Column(name = "ProductCategory")
	private String productcategory;
	
	@Column(name = "ProductDesc")
	private String productdesc;
	
	@Column(name = "ProductCount")
	private String productcount;

}
