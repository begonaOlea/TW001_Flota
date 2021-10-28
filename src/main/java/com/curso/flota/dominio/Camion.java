package com.curso.flota.dominio;

public class Camion extends Vehiculo{
	
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

}
