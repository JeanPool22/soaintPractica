package com.soaint.practica2.repository;

import com.soaint.practica2.model.Acudiente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AcudienteRepository extends JpaRepository<Acudiente, Long>{
    
}
