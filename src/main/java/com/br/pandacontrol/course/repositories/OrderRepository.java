package com.br.pandacontrol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.pandacontrol.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
