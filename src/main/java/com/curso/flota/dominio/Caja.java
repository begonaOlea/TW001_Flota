package com.curso.flota.dominio;

public class Caja {
	
	private double peso;

	public Caja() {
		this.peso = 100;
	}

	public Caja(int peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	

}
