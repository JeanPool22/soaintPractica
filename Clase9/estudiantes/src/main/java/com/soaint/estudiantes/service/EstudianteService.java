package com.soaint.estudiantes.service;

import java.util.List;
import java.util.Optional;

import com.soaint.estudiantes.model.Estudiante;
import com.soaint.estudiantes.repository.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante create(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    public Optional<Estudiante> findById(Long id){
        return estudianteRepository.findById(id);
    }

    public void delete(Long id){
        estudianteRepository.deleteById(id);
    }

    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    public Estudiante update(Long id, Estudiante nuevoEstudiante){
        Optional<Estudiante> aux = estudianteRepository.findById(id);

        if (aux.isPresent()) {
            Estudiante estudiante = aux.get();
            estudiante.setNombre(nuevoEstudiante.getNombre());
            estudiante.setApellido(nuevoEstudiante.getApellido());
            estudiante.setCurso(nuevoEstudiante.getCurso());
            estudiante.setEdad(nuevoEstudiante.getEdad());
            estudiante.setMatricula(nuevoEstudiante.isMatricula());
            estudianteRepository.save(estudiante);
            return estudiante;
        }
        return null;
    }

    public Optional<Estudiante> findByName(String nombre){
        return estudianteRepository.findByNombre(nombre);
    }

    public List<Estudiante> findByNameAndLastName(String nombre, String apellido) {
        return estudianteRepository.findByNombreAndApellido(nombre, apellido);
    }
}
