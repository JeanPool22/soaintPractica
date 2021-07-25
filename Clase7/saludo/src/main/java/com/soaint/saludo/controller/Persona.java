package com.soaint.saludo.controller;

import java.util.ArrayList;

import com.soaint.saludo.entidades.PersonaEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Persona {
    @GetMapping(value = "/personas/{cc}")
    public ResponseEntity<ArrayList<PersonaEntity>> calcular(@PathVariable String cc) {
        PersonaEntity p1 = new PersonaEntity(cc, "Mauricio", "Riascos", 28, 'm', 180);
        PersonaEntity p2 = new PersonaEntity(cc, "Jose", "Rojas", 25, 'm', 160);

        ArrayList<PersonaEntity> p3 = new ArrayList<>();

        p3.add(p1);
        p3.add(p2);

        return new ResponseEntity<ArrayList<PersonaEntity>>(p3, HttpStatus.OK);
    }

    @PostMapping(value = "personas/create")
    public ResponseEntity<PersonaEntity> crearPersona(@RequestBody PersonaEntity persona) {
        PersonaEntity p1 = new PersonaEntity();
        p1.setCc(persona.getCc());
        p1.setNombre(persona.getNombre());
        p1.setApellido(persona.getApellido());
        p1.setEdad(persona.getEdad());
        p1.setSexo(persona.getSexo());
        p1.setEstatura(persona.getEstatura());

        return new ResponseEntity<PersonaEntity>(p1, HttpStatus.CREATED);
    }

    @PutMapping(value = "personas/{cc}")
    public ResponseEntity<PersonaEntity> actualizarPersona(@PathVariable String cc, @RequestBody PersonaEntity persona){
        PersonaEntity p1 = new PersonaEntity();
        p1.setCc(cc);
        p1.setNombre(persona.getNombre());
        p1.setApellido(persona.getApellido());
        p1.setEdad(persona.getEdad());
        p1.setSexo(persona.getSexo());
        p1.setEstatura(persona.getEstatura());

        return new ResponseEntity<PersonaEntity>(p1, HttpStatus.OK);
    }
}
