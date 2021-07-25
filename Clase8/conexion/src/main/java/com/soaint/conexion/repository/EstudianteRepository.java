package com.soaint.conexion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.soaint.conexion.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    public Optional<Estudiante> findByNombre( String nombre);
}
