package com.soaint.estudiantes.repository;

import java.util.List;
import java.util.Optional;

import com.soaint.estudiantes.model.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{
    public Optional<Estudiante> findByNombre(String nombre);
    public List<Estudiante> findByNombreAndApellido (String nombre, String apellido);
}
