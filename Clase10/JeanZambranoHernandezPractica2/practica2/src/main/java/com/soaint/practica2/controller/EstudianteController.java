package com.soaint.practica2.controller;

import java.util.List;
import java.util.Optional;

import com.soaint.practica2.model.Estudiante;
import com.soaint.practica2.service.EstudianteService;

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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @ApiOperation(value = "Agrega un estudiante a la BBDD")
    @PostMapping(value = "/estudiante")
    private ResponseEntity<Estudiante> guardar(@RequestBody Estudiante estudiante) {
        Estudiante aux = estudianteService.create(estudiante);
        return new ResponseEntity<>(aux, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Obtiene un estudiante por id")
    @GetMapping(value = "/estudiante/{id}")
    private ResponseEntity<Optional<Estudiante>> obtener(@PathVariable Long id) {
        Optional<Estudiante> aux = estudianteService.findById(id);
        return new ResponseEntity<>(aux, HttpStatus.FOUND);
    }

    @ApiOperation(value = "Obtiene una lista con todos los estudiantes")
    @GetMapping(value = "/estudiante")
    private ResponseEntity<List<Estudiante>> obtenerTodos() {
        List<Estudiante> aux = estudianteService.findAll();
        return new ResponseEntity<>(aux, HttpStatus.FOUND);
    }

    @ApiOperation(value = "Obtiene un estudainte por estado y sexo", notes = "El estado debe ser activo")
    @GetMapping(value = "/estudiante/{estado}/{sexo}")
    private ResponseEntity<List<Estudiante>> porEstadoSexo(@PathVariable String estado, @PathVariable char sexo) {
        List<Estudiante> aux = estudianteService.findByEstadoAndSexo(estado, sexo);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }

    @ApiOperation(value = "Actualiza un estudiante por id")
    @PutMapping(value = "/estudiante/{id}")
    private ResponseEntity<Estudiante> actuzalizar(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        Estudiante aux = estudianteService.update(id, estudiante);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }

    @ApiOperation(value = "Cambia el estado del estudiante", notes = "Este no elimina el estudiante, solo lo paso a estado inactivo")
    @DeleteMapping(value = "/estudiante/{id}")
    private ResponseEntity<String> eliminar(@PathVariable Long id) {
        estudianteService.delete(id);
        return new ResponseEntity<>("Estado del estudiante inactivo", HttpStatus.OK);
    }
}
