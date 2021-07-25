package com.soaint.saludo.entidades;

public class OrdenEntity {
    private String numero;
    private String nombre;
    private boolean estado;

    public OrdenEntity(String numero, String nombre, boolean estado) {
        this.numero = numero;
        this.nombre = nombre;
        this.estado = estado;
    }

    public OrdenEntity() {

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}