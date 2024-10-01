package com.estudospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
