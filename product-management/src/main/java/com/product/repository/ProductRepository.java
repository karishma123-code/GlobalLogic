package com.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.model.Product;

//Interface  which inherits JpaRepository and its features

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
	//@Query("SELECT p FROM Product p WHERE p.product_name LIKE %?1%"
           // + " OR p.manufacturer LIKE %?1%"
           // + " OR p.color LIKE %?1%"
           // + " OR CONCAT(p.price, '') LIKE %?1%")
	
	
	List<Product> findByProductNameContaining(String productName);

    List<Product> findByProductName(String productName);

    public List<Product> findByPriceLessThan(double price);

}
