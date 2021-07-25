package com.soaint.conexion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soaint.conexion.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
	
}
