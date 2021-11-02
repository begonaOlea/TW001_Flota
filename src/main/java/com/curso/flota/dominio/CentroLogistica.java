package com.curso.flota.dominio;

import com.curso.flota.excepciones.CargaException;

public class CentroLogistica {
	
	public static void cargarVehiculo(Vehiculo v, Caja[] cajas) throws CargaException, Exception {
		//cargar las cajas en el vehículo
		int idCaja = 0;
		for(Caja c: cajas) {
			try {
				v.cargar(c.getPeso()); //puede lanzar un CargaException
			}catch(CargaException e) {
				throw new CargaException ("caja " + idCaja + "-"+ e.getMessage());
			}catch(Exception e) {
				throw new Exception("caja " + idCaja + "error inesperado. No se pudo cargar");
			}
			idCaja ++;
		}
		
	}
	
	public static void main(String[] args) {
		//crear un camion
		//crear un array con 5 cajas
		// llamar a cargarVehiculo 
		
		Camion c = new Camion("B888",3000,3);
		Caja[] cajas = {
				new Caja(20),
				new Caja(20),
				new Caja(2909),
				new Caja(120),
				new Caja(0)
		};
		
		try {
			CentroLogistica.cargarVehiculo(c, cajas);
		} catch (Exception e) {
			System.out.println("No se pudo cargar. Motivo " + e.getMessage());
		} 
		
	}

}
