package com.estudospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudospring.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
