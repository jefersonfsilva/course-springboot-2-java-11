package com.br.pandacontrol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.pandacontrol.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
