package com.curso.flota.dominio;

import java.util.Date;

public class Camion extends Vehiculo implements Reservable{
	
	//atributos
	private int numeroEjes;
	
	//constructores
	public Camion(String matricula, double cargaMaxima, int ejes) {
		super(matricula,cargaMaxima);
		this.numeroEjes = ejes;
	}
	
	//métodos
	public int getNumeroEjes() {
		return numeroEjes;
	}

	@Override
	public double calcularFuel() {
		return getCargaActual() * 0.80;
	}

	@Override
	public boolean reservar(Date fecha) {
		return false;
	}



}
