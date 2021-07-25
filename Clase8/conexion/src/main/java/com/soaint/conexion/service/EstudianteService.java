package com.soaint.conexion.service;

import java.util.List;
import java.util.Optional;

import com.soaint.conexion.model.Estudiante;
import com.soaint.conexion.repository.EstudianteRepository;

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

    public void delete(Long id) {
        estudianteRepository.deleteById(id);
    }

    public List<Estudiante> findAll(){
        return estudianteRepository.findAll();
    }

    public Estudiante update(Long id, Estudiante nuevoEstudiante){
        Optional<Estudiante> aux = estudianteRepository.findById(id);

        if (aux.isPresent()) {
            Estudiante estudiante = aux.get();
			estudiante.setNombre(nuevoEstudiante.getNombre());
            estudiante.setEdad(nuevoEstudiante.getEdad());
            estudiante.setSexo(nuevoEstudiante.getSexo());
            estudianteRepository.save(estudiante);
            return(estudiante);
        }

        return null;
    }

    public Optional<Estudiante> buscarPorEstudiante( String nombre){
        return estudianteRepository.findByNombre(nombre);
    }
}
