package com.soaint.practica2.controller;

import java.util.List;
import java.util.Optional;

import com.soaint.practica2.model.Matricula;
import com.soaint.practica2.service.MatriculaService;

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
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @ApiOperation(value = "Agrega una matricula a la BBDD")
    @PostMapping(value = "/matricula")
    private ResponseEntity<Matricula> guardar(@RequestBody Matricula matricula) {
        Matricula aux = matriculaService.create(matricula);
        return new ResponseEntity<>(aux, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Obtiene una matricula por id")
    @GetMapping(value = "/matricula/{id}")
    private ResponseEntity<Optional<Matricula>> obtener(@PathVariable Long id) {
        Optional<Matricula> aux = matriculaService.findById(id);
        return new ResponseEntity<>(aux, HttpStatus.FOUND);
    }

    @ApiOperation(value = "Obtiene una lista con todas las matriculas")
    @GetMapping(value = "/matricula")
    private ResponseEntity<List<Matricula>> obtenerTodos() {
        List<Matricula> aux = matriculaService.findAll();
        return new ResponseEntity<>(aux, HttpStatus.FOUND);
    }

    @ApiOperation(value = "Actualiza una matricula por id")
    @PutMapping(value = "/matricula/{id}")
    private ResponseEntity<Matricula> actuzalizar(@PathVariable Long id, @RequestBody Matricula matricula) {
        Matricula aux = matriculaService.update(id, matricula);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }
    
    @ApiOperation(value = "Elimina una matricula por id")
    @DeleteMapping(value = "/matricula/{id}")
    private ResponseEntity<String> eliminar(@PathVariable Long id) {
        matriculaService.delete(id);
        return new ResponseEntity<>("Matricula eliminada", HttpStatus.OK);
    }
}
