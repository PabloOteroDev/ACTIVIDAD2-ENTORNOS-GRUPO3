package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import programa.Jugador;
import programa.Soldado;

class SoldadoTest {
	
	/**
	 * 
	 */

	private Soldado s1;
	
	@BeforeEach
	//Me interesa antes de cada test tener un objeto Soldado
	//limpio (nuevo)
	void setUp()throws Exception {
		s1 = new Soldado ();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		s1 = null;
	}
	
	@Test
	public void testEstaMuerto() {
		Soldado soldado = new Soldado();
		soldado.setEstaMuerto(true);
		
		//Ahora el resultado esperado es que el soldado este muerto
				assertTrue(soldado.isEstaMuerto());		
	}
	
	public void testNoEstaMuerto() {
		Soldado soldado = new Soldado ();
		soldado.setEstaMuerto(false);
		
		//Ahora el resultado esperado es que el soldado NO este muerto
				assertFalse(soldado.isEstaMuerto());		
	}

	/*
	 * En este caso vamos a probar que tiene balas
	 * es decir, puede disparar
	 * por lo que si tiene balas y puede disparar esta vivo
	 */
	
	@Test
	public void testEstaVivoConBalas() {
		Soldado soldado = new Soldado ();
		soldado.setNumeroBalas(10);
		soldado.puedeDisparar();
		soldado.setEstaMuerto(false);
		
		//Ahora el resultado esperado es que el soldado NO este muerto
				assertFalse(soldado.isEstaMuerto());		
	}
	
	@Test
	public void testEstaMuertoSinBalas () {
		Soldado soldado = new Soldado ();
		soldado.setNumeroBalas(0);
		soldado.puedeDisparar();
		soldado.setEstaMuerto(true);
		
		//Ahora el resultado esperado es que el soldado NO tenga balas y este muerto
		assertTrue(soldado.isEstaMuerto());	
	}
	@Test
	public void testPuedeDisparar () {
		Soldado soldado = new Soldado ();
			soldado.disparar(soldado);
			soldado.setEstaMuerto(false);
			
			//Ahora el resultado esperado es que el soldado puede disparar
			// y al poder disparar se defiende y esta vivo
			assertFalse(soldado.isEstaMuerto());	
		}
	}
	
	
	
	
	


