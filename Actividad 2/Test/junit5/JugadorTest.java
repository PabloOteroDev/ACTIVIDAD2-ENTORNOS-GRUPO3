package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clases.Jugador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * @author Donato Uechi
 */

class JugadorTest {

	private Jugador jug;
	
	public void escenario() {
		jug = new Jugador(25,1,0);
	}
	
	/*
	 * se espera que el numero de dorsal 
	 * sea igual a 25
	 */
	@Test
	public void testDorsal() {
		escenario();
		
		assertEquals(25, jug.getDorsal());
	}
	
	
	/*
	 * se espera que el numero de tarjetas amarillas 
	 * sea igual a 1
	 */
	@Test
	public void testNumeroTarjetasAmarillas() {
		escenario();
		
		assertEquals(1, jug.getNumeroTarjetasAmarillas());
	}
	
	
	
	/*
	 *se espera que el numero de tarjetas rojas 
	 *sea igual a 0
	 */
	@Test
	public void testNumeroTarjetasRojas() {
		escenario();
		
		assertEquals(0, jug.getNumeroTarjetasRojas());
	}
	
	
	/*
	 *se espera que el metodo ponerDorsal devuelva
	 *Dorsal = 25
	 */
	
	

}
