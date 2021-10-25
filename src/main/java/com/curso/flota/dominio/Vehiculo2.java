package com.curso.flota.dominio;

/**
 * Clase que representa un camion.......
 * 
 * @author begonaolea
 * @version 1
 */
public class Vehiculo2 {
	
	//atributos
	private double cargaMaxima;
	private String matricula;
	private double cargaActual = 0.0;
	private int numeroCajas = 0;

	//constructores
	public  Vehiculo2(String matricula, double cargaMaxima) {
		super();
		//validar
		if(matricula == null) {
			this.matricula = "";
		}else {
			this.matricula = matricula;
		}
		if(cargaMaxima <= 100) {
			this.cargaMaxima = 100;
		}else {
		
			this.cargaMaxima = cargaMaxima;
		}
	
			
		
	} //fin constructor
	

	//métodos
		
	public double getCargaMaxima() {
		return this.cargaMaxima;
	}

	
	public String getMatricula() {
		return matricula;
	}

	
	public double getCargaActual() {
		return cargaActual;
	}


	public int getNumeroCajas() {
		return numeroCajas;
	}

    /**
     * Método que carga una caja (<b>peso en kg</b>) en el camión
     * Si el peso de la caja supera la carga permitida 
     * teniendo en cuenta la carga actual, no carga la caja
     * y devuelve false
     * EJemplo:
     *     ....
     * 
     * @param peso  double con peso de la caja a cargar en kg
     *              el peso debe ser positivo
     * @return  boolean que es true pudo carga y false sino
     */
	public boolean cargar(double peso) {
		  if(peso <= 0) {
			  return false;
		  }
		  if( cargaMaxima <  (peso + cargaActual)) {
			  return false;
		  }
		this.cargaActual += peso;
		this.numeroCajas ++;
		return true; 
	}
	
	
	public boolean cargar(Caja caja) {
		 if(caja.getPeso() <= 0) {
			  return false;
		  }
		  if( cargaMaxima <  (caja.getPeso() + cargaActual)) {
			  return false;
		  }
		this.cargaActual += caja.getPeso();
		this.numeroCajas ++;
		return true; 
	}
	
	

} //fin clase 
