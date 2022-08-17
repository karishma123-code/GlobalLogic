package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Product;

//Interface  which inherits JpaRepository and its features

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
