package com.soaint.h2.controller;

import java.util.List;
import java.util.Optional;

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

import com.soaint.h2.model.Orden;
import com.soaint.h2.service.OrdenService;

@RestController
public class OrdenController {
	
	@Autowired
	private OrdenService ordenService;
	
	@PostMapping(value = "/orden")
	private ResponseEntity<Orden> guardar(@RequestBody Orden orden) {
		Orden aux = ordenService.create(orden);
		return new ResponseEntity<>(aux, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/orden/{id}")
	private ResponseEntity<Optional<Orden>> obtener(@PathVariable Long id) {
		Optional<Orden> aux = ordenService.findById(id);
		return new ResponseEntity<>(aux, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/orden/{id}")
	private ResponseEntity<String> eliminar(@PathVariable Long id) {
		ordenService.delete(id);
		return new ResponseEntity<>("Orden eliminada...", HttpStatus.OK);
	}
	
	@GetMapping(value = "/orden")
	private ResponseEntity<List<Orden>> listar() {
		List<Orden> aux = ordenService.findAll();
		return new ResponseEntity<>(aux, HttpStatus.OK);
	}
	
	@PutMapping(value = "/orden/{id}")
	private ResponseEntity<Orden> actualizar(@PathVariable Long id, @RequestBody Orden orden) {
		Orden aux = ordenService.update(id, orden);
		return new ResponseEntity<>(aux, HttpStatus.OK);
	}
	
}
