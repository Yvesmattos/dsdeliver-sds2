package com.mattos.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mattos.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
