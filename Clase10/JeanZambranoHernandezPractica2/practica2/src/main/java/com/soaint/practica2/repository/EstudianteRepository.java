package com.soaint.practica2.repository;

import java.util.List;

import com.soaint.practica2.model.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    public List<Estudiante> findByEstadoAndSexo(String esatado, char sexo);
}
