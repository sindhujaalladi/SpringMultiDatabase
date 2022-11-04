package com.springmultidatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmultidatabase.Entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{

}
