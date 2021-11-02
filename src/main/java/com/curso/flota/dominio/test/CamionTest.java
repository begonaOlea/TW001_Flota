package com.curso.flota.dominio.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.curso.flota.dominio.Camion;
import com.curso.flota.excepciones.CargaException;

public class CamionTest {

	
	@Test(expected = CargaException.class)
	public void cargarCajaPesoNegativo() throws CargaException {

		Camion c = new Camion("B888",3000,3);
		c.cargar(-9);
	}
	
	@Test(expected = CargaException.class)
	public void cargarCajaExcedeCargaMax() throws CargaException {

		Camion c = new Camion("B888",3000,3);
		c.cargar(3002);
	}
	
	

	@Test
	public void cargarCajaCabe() {

		Camion c = new Camion("B888",3000,3);
		try {
			c.cargar(100);
			if (c.getCargaActual() != 100) {
				fail("la carga actual del camión no se ha inc");
			}
		} catch (CargaException e) {
			fail("da excepcion " + e.getMessage());
		}
	}
	

}
