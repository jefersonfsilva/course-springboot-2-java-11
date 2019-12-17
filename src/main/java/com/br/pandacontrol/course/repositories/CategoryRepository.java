package com.br.pandacontrol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.pandacontrol.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
