package com.curso.flota.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Vehiculo2Test {

	@Test
	void crearVehiculoConCargaMaxCeroEntoncePondraCargaMaxA100() {
		
		//PREPARAS DATOS DE ENTRADA DE LA PRUEBA
		Vehiculo v = new Vehiculo("B111", 0);
		
		double espero = 100;
		double recibo = v.getCargaMaxima();
		
		if(espero != recibo) {
			fail("Carga maxima debe ser 100");
		}
	}
	
	@Test
	void cargarUnaCajaQueCabeEnunVEhiculoVAcio() {
		
		Vehiculo v = new Vehiculo("B111", 200);
		Caja caja =new Caja();
		boolean entro = v.cargar(caja); 
		
		double esperoNCaja = 1;
		double esperoPesoAct = caja.getPeso();
		
		if(! entro || esperoNCaja != v.getNumeroCajas()
				|| esperoPesoAct != v.getCargaActual()) {
			fail("No debiste cargar esta caja");
		}
		
		
	}
	
	

}
