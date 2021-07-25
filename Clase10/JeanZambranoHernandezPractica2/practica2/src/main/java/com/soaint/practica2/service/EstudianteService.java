package com.soaint.practica2.service;

import java.util.List;
import java.util.Optional;

import com.soaint.practica2.model.Estudiante;
import com.soaint.practica2.repository.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante create(Estudiante estudiante) {
        if (estudiante.getEdad() < 18) {
            return estudianteRepository.save(estudiante);
        }
        return estudianteRepository.save(null);
    }

    public Optional<Estudiante> findById(Long id) {
        return estudianteRepository.findById(id);
    }

    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    public Estudiante update(Long id, Estudiante nuevoEstudiante) {
        Optional<Estudiante> aux = estudianteRepository.findById(id);

        if (aux.isPresent()) {
            Estudiante estudiante = aux.get();
            estudiante.setNombre(nuevoEstudiante.getNombre());
            estudiante.setIdentificacion(nuevoEstudiante.getIdentificacion());
            estudiante.setCorreo(nuevoEstudiante.getCorreo());
            estudiante.setEdad(nuevoEstudiante.getEdad());
            estudiante.setEstado(nuevoEstudiante.getEstado());
            estudiante.setSexo(nuevoEstudiante.getSexo());
            estudianteRepository.save(estudiante);
            return estudiante;
        }
        return null;
    }

    public Estudiante delete(Long id) {
        Optional<Estudiante> aux = estudianteRepository.findById(id);

        if (aux.isPresent()) {
            Estudiante estudiante = aux.get();
            estudiante.setEstado("inactivo");
            estudianteRepository.save(estudiante);
            return estudiante;
        }
        return null;
    }

    public List<Estudiante> findByEstadoAndSexo(String estado, char sexo) {
        if (estado.equals("activo")) {
            return estudianteRepository.findByEstadoAndSexo(estado, sexo);
        }
        return estudianteRepository.findByEstadoAndSexo(null, sexo);
    }
}
