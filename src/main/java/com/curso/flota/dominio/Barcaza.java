package com.curso.flota.dominio;

public class Barcaza extends Vehiculo{
	
	private double potenciaMotor;

	public Barcaza(String matricula, 
			double cargaMaxima,
			double potenciaMotor) {
		super(matricula, cargaMaxima);
		this.potenciaMotor = potenciaMotor;
	}
	
	public double getPotenciaMotor() {
		return potenciaMotor;
	}
	

}
