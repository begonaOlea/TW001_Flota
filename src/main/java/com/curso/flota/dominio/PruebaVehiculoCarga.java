package com.curso.flota.dominio;

import com.curso.flota.excepciones.CargaException;

public class PruebaVehiculoCarga {

	public static void main(String[] args) {
		
		Camion c = new Camion("B888",3000,3);
		try {
			c.cargar(3005);
			System.out.println("carga ok ");
		} catch (CargaException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
