package com.soaint.practica2.service;

import java.util.List;
import java.util.Optional;

import com.soaint.practica2.model.Matricula;
import com.soaint.practica2.repository.MatriculaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    public Matricula create(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    public Optional<Matricula> findById(Long id) {
        return matriculaRepository.findById(id);
    }

    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }

    public Matricula update(Long id, Matricula nuevaMatricula) {
        Optional<Matricula> aux = matriculaRepository.findById(id);

        if (aux.isPresent()) {
            Matricula matricula = aux.get();
            matricula.setFechaMatricula(nuevaMatricula.getFechaMatricula());
            matricula.setRadicado(nuevaMatricula.getRadicado());
            matriculaRepository.save(matricula);
            return matricula;
        }
        return null;
    }

    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }
}
