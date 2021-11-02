package com.curso.flota.dominio;

import com.curso.flota.excepciones.CargaException;

/**
 * Clase que representa un camion.......
 * 
 * @author begonaolea
 * @version 1
 */
public abstract class Vehiculo {
	
	//atributos
	private double cargaMaxima;
	private String matricula;
	protected double cargaActual = 0.0;
	private int numeroCajas = 0;

//	public Vehiculo() {
//		super();
//		
//	}
	
	//constructores
	public  Vehiculo(String matricula, double cargaMaxima) {
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
     * y devuelve una excepcion
     * EJemplo:
     *     ....
     * 
     * @param peso  double con peso de la caja a cargar en kg
     *              el peso debe ser positivo
     * @throws CargaException si el peso de la caja no es positivo o supera la carga max permi 
     */
	public void cargar(double peso) throws CargaException {
		  if(peso <= 0) {
			throw new CargaException("Peso de la caja no puede ser <= 0");
		  }
		  if( cargaMaxima <  (peso + cargaActual)) {
			 throw new CargaException("No se pudo cargar caja. "
			 		+ "Supera la carga máxima permitida");
		  }
		this.cargaActual += peso;
		this.numeroCajas ++;
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
	
	
	public abstract double calcularFuel();
	



} //fin clase 
