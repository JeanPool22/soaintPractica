package com.soaint.estudiantes.controller;

import java.util.List;
import java.util.Optional;

import com.soaint.estudiantes.model.Estudiante;
import com.soaint.estudiantes.service.EstudianteService;

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

    @ApiOperation(value = "Obtiene un estudiante de acuerdo a su id", notes = "Esta operación retorna una orden de acuerdo a su id")
    @GetMapping(value = "/estudiante/{id}")
    private ResponseEntity<Optional<Estudiante>> obtener(@PathVariable Long id) {
        Optional<Estudiante> aux = estudianteService.findById(id);
        return new ResponseEntity<>(aux, HttpStatus.FOUND);
    }

    @ApiOperation(value = "Obtiene un listado de todos los estudiantes")
    @GetMapping(value = "/estudiante")
    private ResponseEntity<List<Estudiante>> obtenerTodos() {
        List<Estudiante> aux = estudianteService.findAll();
        return new ResponseEntity<>(aux, HttpStatus.FOUND);
    }

    @ApiOperation(value = "Obtiene un estudiante por su nombre", notes = "Esta operación retorna una orden de acuerdo a su nombre")
    @GetMapping(value = "/estudiante/getByName/{nombre}")
    private ResponseEntity<Optional<Estudiante>> porNombre(@PathVariable String nombre) {
        Optional<Estudiante> aux = estudianteService.findByName(nombre);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }

    @ApiOperation(value = "Obtiene un estudiante por su nombre y apellido", notes = "Esta operación retorna una orden de acuerdo a su nombre y apellido")
    @GetMapping(value = "/estudiante/getByNameLastName/{nombre}/{apellido}")
    private ResponseEntity<List<Estudiante>> porNombreApellido(@PathVariable String nombre, @PathVariable String apellido) {
        List<Estudiante> aux = estudianteService.findByNameAndLastName(nombre, apellido);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }

    @ApiOperation(value = "Actualiza los datos un estudiante de acuerdo a su id", notes = "Esta operación retorna una orden de acuerdo a los nuevos datos ingresados")
    @PutMapping(value = "/estudiante/{id}")
    private ResponseEntity<Estudiante> actuzalizar(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        Estudiante aux = estudianteService.update(id, estudiante);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }

    @ApiOperation(value = "Elimina un estudiante de acuerdo a su id")
    @DeleteMapping(value = "/estudiante/{id}")
    private ResponseEntity<String> eliminar(@PathVariable Long id) {
        estudianteService.delete(id);
        return new ResponseEntity<>("Estudiante eliminado", HttpStatus.OK);
    }
}
