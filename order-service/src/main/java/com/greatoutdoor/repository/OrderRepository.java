package com.greatoutdoor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoor.entity.Order;

//JPA repository for crud methods

public interface OrderRepository extends JpaRepository<Order,Long>{

}
