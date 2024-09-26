package com.estudospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
