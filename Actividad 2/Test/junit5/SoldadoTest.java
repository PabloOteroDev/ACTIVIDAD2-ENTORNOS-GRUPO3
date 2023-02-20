package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clases.Soldado;

/*
 * @author Donato Uechi
 */


class SoldadoTest {
	
	private Soldado sol;
	
	public void escenario() {
		sol = new Soldado(false, 10);
	}

	
	
	/*
	 * assertFalse espera false el atributo
	 * esta muerto es false.
	 */
	@Test
	public void testEstaMuerto() {
		escenario();
		assertFalse(sol.isEstaMuerto());
	}
	
	
	/*
	 * assertrue espera true y el metodo puedeDisparar
	 * devuelve true ya que el numero de balas es > 0
	 */
	@Test
	public void testPuedeDisparar() {
		escenario();
		assertTrue(sol.puedeDisparar());
	}
	
	/*
	 * assertEquals espera la igualdad entre el valor 
	 * esperado 10 y el obtenido del objeto sol
	 */
	@Test
	public void testNumeroBalas() {
		escenario();
	
		assertEquals(10, sol.getNumeroBalas());
	}

}
