package com.br.pandacontrol.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.pandacontrol.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
