package com.soaint.saludo.controller;

import com.soaint.saludo.entidades.OrdenEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Orden {
    @GetMapping(value = "/orden/")
    public ResponseEntity<OrdenEntity> consultarOrden() {
        OrdenEntity o1 = new OrdenEntity();
        o1.setNumero("12345");
        o1.setNombre("Perez");
        o1.setEstado(true);

        return new ResponseEntity<OrdenEntity>(o1, HttpStatus.OK);
    }

    @GetMapping(value = "/orden/{orderId}")
    public ResponseEntity<OrdenEntity> consultarOrden(@PathVariable String orderId) {
        OrdenEntity o1 = new OrdenEntity();
        o1.setNumero(orderId);
        o1.setNombre("Perez");
        o1.setEstado(true);

        return new ResponseEntity<OrdenEntity>(o1, HttpStatus.OK);
    }

    @PostMapping(value = "orden/create")
    public ResponseEntity<OrdenEntity> crearOrden( @RequestBody OrdenEntity orden) {
        OrdenEntity o1 = new OrdenEntity();
        o1.setNumero(orden.getNumero());
        o1.setNombre(orden.getNombre());
        o1.setEstado(true);

        return new ResponseEntity<OrdenEntity>(o1, HttpStatus.CREATED);
    }

    @PutMapping(value = "/orden/{orderId}")
    public ResponseEntity<OrdenEntity> actualizarOrden ( @PathVariable String orderId, @RequestBody OrdenEntity orden){
        OrdenEntity o1 = new OrdenEntity();
        o1.setNumero(orderId);
        o1.setNombre(orden.getNombre());

        return new ResponseEntity<OrdenEntity>(o1, HttpStatus.OK);
    }
}
