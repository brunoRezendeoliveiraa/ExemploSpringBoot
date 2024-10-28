package com.estudospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.curso.entities.OrderItem;
import com.estudospring.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
