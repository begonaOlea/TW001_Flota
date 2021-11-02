package com.curso.flota.dominio;

import com.curso.flota.informes.InformeFlota;

public class PruebaHerenciaVehiculos {
	
	public static void main(String... args) {
		
		Camion c = new Camion("2345G",4000,3);	
		c.cargar(new Caja());
		Barcaza b = new Barcaza("3333RR", 1000, 50.9);
		
		// Una var de ref puede apuntar a objetos de 
		// su clase definida o clases hija
		
		Vehiculo v = new Camion("4444G",500,3);	
		
		Vehiculo[] lista = new Vehiculo[4];
		lista[0] = c;
		lista[1] = b;
		lista[2] = new Camion("5552D",4000,2);
		lista[3] = new Avioneta("AAAAA3",500);
		
		for(Vehiculo vh : lista) {
			System.out.println(vh.getMatricula());
		}

		double potencia = b.getPotenciaMotor();
	//	double potencia2 = lista[1].getPotenciaMotor();
		
		double potencia2 =( (Barcaza) lista[1] ).getPotenciaMotor();
	
		System.out.println("... informe  flota .... ");
		
		for(Vehiculo vh : lista) {
			System.out.print(vh.getMatricula());
			//si es bracaza di potencia
			if( vh instanceof Barcaza) {
				Barcaza z = (Barcaza) vh;
				System.out.println(" - " + z.getPotenciaMotor());
			}
		}
			
		
		InformeFlota informe = new InformeFlota();
		informe.generaInformeFlota(lista);
		
		
		
		
	}

}
