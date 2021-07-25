package com.soaint.conexion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soaint.conexion.model.Orden;
import com.soaint.conexion.repository.OrdenRepository;

@Service
public class OrdenService {
	
	@Autowired
	private OrdenRepository ordenRepository;
	
	public Orden create(Orden orden) {
		return ordenRepository.save(orden);
	}
	
	public Optional<Orden> findById(Long id) {
		return ordenRepository.findById(id);
	}
	
	public void delete(Long id) {
		ordenRepository.deleteById(id);
	}
	
	public List<Orden> findAll() {
		return ordenRepository.findAll();
	}
	
	public Orden update(Long id, Orden nuevaOrden) {
		Optional<Orden> aux = ordenRepository.findById(id);
		
		if(aux.isPresent()) {
			Orden orden = aux.get();
			orden.setNumeroOrden(nuevaOrden.getNumeroOrden());
			orden.setCliente(nuevaOrden.getCliente());
			orden.setFecha(nuevaOrden.getFecha());
			ordenRepository.save(orden);
			return(orden);
		}
		
		return null;
	}
	
}
