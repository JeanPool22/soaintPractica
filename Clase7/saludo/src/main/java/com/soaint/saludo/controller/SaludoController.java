package com.soaint.saludo.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController { 
    @GetMapping(value = "/saludo")
    public String saludar() {
        return "Hola Mundo " + LocalDate.now();
    }
}