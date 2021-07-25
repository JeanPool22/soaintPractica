package com.soaint.practica2.service;

import java.util.List;
import java.util.Optional;

import com.soaint.practica2.model.Acudiente;
import com.soaint.practica2.repository.AcudienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcudienteService {
    @Autowired
    private AcudienteRepository acudienteRepository;

    public Acudiente create(Acudiente acudiente){
        return acudienteRepository.save(acudiente);
    }

    public Optional<Acudiente> findById(Long id) {
        return acudienteRepository.findById(id);
    }

    public List<Acudiente> findAll() {
        return acudienteRepository.findAll();
    }

    public Acudiente update(Long id, Acudiente nuevoAcudiente){
        Optional<Acudiente> aux = acudienteRepository.findById(id);

        if (aux.isPresent()) {
            Acudiente acudiente = aux.get();
            acudiente.setNombre(nuevoAcudiente.getNombre());
            acudiente.setCedula(nuevoAcudiente.getCedula());
            acudiente.setCelular(nuevoAcudiente.getCelular());
            acudiente.setDireccion(nuevoAcudiente.getDireccion());
            acudienteRepository.save(acudiente);
            return acudiente;
        }
        return null;
    }

    public void delete(Long id) {
        acudienteRepository.deleteById(id);
    }
}
