package com.curso.flota.informes;

import com.curso.flota.dominio.Barcaza;
import com.curso.flota.dominio.Vehiculo;
import java.util.*;

public class InformeFlota {

	public void generaInformeFlota(Vehiculo[] lista) {
	 
		System.out.println(".... informe flota ..... ");
		double totalConsumo = 0;
		for(Vehiculo vh : lista) {
			
			System.out.print(vh.getMatricula());
			//si es bracaza di potencia
			if( vh instanceof Barcaza) {
				Barcaza z = (Barcaza) vh;
				System.out.print(" - " + z.getPotenciaMotor());
			}
			double fuel = vh.calcularFuel();
			System.out.println(" - consume " + fuel  );
			totalConsumo += fuel;
		}//Fin recorrer lista
		
		System.out.println("------------------------");
		System.out.println(" Consumo total fuel " + totalConsumo);
		System.out.println("------------------------");
		
		
	}//fin metodo generarInformeFlota
	
}
