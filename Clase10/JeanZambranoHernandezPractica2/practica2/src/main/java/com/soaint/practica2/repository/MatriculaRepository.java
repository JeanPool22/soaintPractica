package com.soaint.practica2.repository;

import com.soaint.practica2.model.Matricula;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
    
}
