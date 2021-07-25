package com.soaint.conexion.controller;

import java.util.List;
import java.util.Optional;

import com.soaint.conexion.model.Estudiante;
import com.soaint.conexion.service.EstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @PostMapping(value = "/estudiante")
    private ResponseEntity<Estudiante> guardar(@RequestBody Estudiante estudiante){
        Estudiante aux = estudianteService.create(estudiante);
        return new ResponseEntity<>(aux, HttpStatus.CREATED);
    }

    @GetMapping(value = "/estudiante/{id}")
    private ResponseEntity<Optional<Estudiante>> obtener(@PathVariable Long id){
        Optional<Estudiante> aux = estudianteService.findById(id);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }

    @DeleteMapping(value = "/estudiante/{id}")
	private ResponseEntity<String> eliminar(@PathVariable Long id) {
		estudianteService.delete(id);
		return new ResponseEntity<>("Se eliminó el registro", HttpStatus.OK);
	}

    @GetMapping(value = "/estudiante")
	private ResponseEntity<List<Estudiante>> listar() {
		List<Estudiante> aux = estudianteService.findAll();
		return new ResponseEntity<>(aux, HttpStatus.OK);
	}

    @PutMapping(value = "/orden/{id}")
	private ResponseEntity<Estudiante> actualizar(@PathVariable Long id, @RequestBody Estudiante estudiante) {
		Estudiante aux = estudianteService.update(id, estudiante);
		return new ResponseEntity<>(aux, HttpStatus.OK);
	}

    @GetMapping(value = "/estudiante/getByName/{nombre}")
    private ResponseEntity<Optional<Estudiante>> porNombre(@PathVariable String nombre){
        Optional<Estudiante> aux = estudianteService.buscarPorEstudiante(nombre);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }
}
