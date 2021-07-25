package com.soaint.practica2.controller;

import java.util.List;
import java.util.Optional;

import com.soaint.practica2.model.Acudiente;
import com.soaint.practica2.service.AcudienteService;

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
public class AcudienteController {
    @Autowired
    private AcudienteService acudienteService;

    @ApiOperation(value = "Agrega un acudiente a la BBDD")
    @PostMapping(value = "/acudiente")
    private ResponseEntity<Acudiente> guardar(@RequestBody Acudiente acudiente) {
        Acudiente aux = acudienteService.create(acudiente);
        return new ResponseEntity<>(aux, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Obtiene un acudiente por id")
    @GetMapping(value = "/acudiente/{id}")
    private ResponseEntity<Optional<Acudiente>> obtener(@PathVariable Long id) {
        Optional<Acudiente> aux = acudienteService.findById(id);
        return new ResponseEntity<>(aux, HttpStatus.FOUND);
    }

    @ApiOperation(value = "Obtiene una lista con todos los acudientes")
    @GetMapping(value = "/acudiente")
    private ResponseEntity<List<Acudiente>> obtenerTodos() {
        List<Acudiente> aux = acudienteService.findAll();
        return new ResponseEntity<>(aux, HttpStatus.FOUND);
    }

    @ApiOperation(value = "Actualiza un acudiente por id")
    @PutMapping(value = "/acudiente/{id}")
    private ResponseEntity<Acudiente> actuzalizar(@PathVariable Long id, @RequestBody Acudiente acudiente) {
        Acudiente aux = acudienteService.update(id, acudiente);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }

    @ApiOperation(value = "Elimina un acudiente por id")
    @DeleteMapping(value = "/acudiente/{id}")
    private ResponseEntity<String> eliminar(@PathVariable Long id) {
        acudienteService.delete(id);
        return new ResponseEntity<>("Acudiente eliminado", HttpStatus.OK);
    }
}
