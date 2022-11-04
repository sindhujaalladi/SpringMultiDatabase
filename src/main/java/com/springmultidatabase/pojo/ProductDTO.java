package com.springmultidatabase.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO implements Serializable{ 
	
	private int productid;
	private String productname;
	private String productcategory;
	private String productdesc;
	private String productcount;

}
