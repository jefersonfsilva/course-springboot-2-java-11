package com.br.pandacontrol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.pandacontrol.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
