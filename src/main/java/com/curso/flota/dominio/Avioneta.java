package com.curso.flota.dominio;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Date;

public class Avioneta extends Vehiculo 
                      implements Volable, Reservable{

	//constructor
	public Avioneta(String matricula, double cargaMaxima) {
		super(matricula, cargaMaxima);
	
	}
	
	@Override
	public double calcularFuel() {
		return 30;
	}

	@Override
	public void volar() {
		
		System.out.println("Vuelo a una altura maxima de " 
		+ Volable.ALTURA_MAXIMA_VUELO);
		
	}

	@Override
	public boolean reservar(Date fecha) {
		return true;
	}


}
