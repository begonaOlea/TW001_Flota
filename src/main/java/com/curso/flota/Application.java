package com.curso.flota;

import com.curso.flota.dominio.Vehiculo;

public class Application
{
	public static void main( String[] args ){
		
		System.out.println("-- prueba clase Vehiculo --");
		
		Vehiculo v = new Vehiculo("B111",200.0);
		
		System.out.println("cargo  100kg");
		if ( ! v.cargar(100) ) {
			System.out.println("No pudo cargar 100");
		}
		System.out.println("carga actual " + v.getCargaActual());
		System.out.println("numero cajas " + v.getNumeroCajas());
		
		System.out.println("cargo  120kg");
		if ( ! v.cargar(120) ) {
			System.out.println("No pudo cargar 120");
		}
		System.out.println("carga actual " + v.getCargaActual());
		System.out.println("numero cajas " + v.getNumeroCajas());
		
		int a = 3;
	    
		
		
	}
	
	
	
	
	
}