package com.soaint.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soaint.h2.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
	
}
