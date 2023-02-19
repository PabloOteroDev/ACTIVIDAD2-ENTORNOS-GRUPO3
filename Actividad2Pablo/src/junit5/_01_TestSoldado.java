package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import requerimento1.Soldado;

/**
 * 
 * @author 
 *
 */

public class _01_TestSoldado {
	
	private Soldado s1;
		
	@BeforeEach
	void setUp() throws Exception {
		s1 = new Soldado(false, 0);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		s1 = null;
	}
	
	@Test
	public void testSetEstaMuerto() {
		s1.setEstaMuerto(true);
	
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.isEstaMuerto();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testSetNumeroBalas() {

		s1.setNumeroBalas(0);
		
		int resultadoEsperado = 0;
		int resultadoObtenido = s1.getNumeroBalas();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	
	@Test //movida cuando tiene bala que pegue tiros
	public void testPuedeDisparar1() {
		
		s1.setNumeroBalas(0);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = s1.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		
	}
	
	@Test //mismo que el anterior pero al revés
	public void testPuedeDisparar2() {
		
		s1.setNumeroBalas(1);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		
	}
	
	@Test //movida matar
	public void disparar() {
		
		Soldado s2 = new Soldado(false,0);
		s1.setNumeroBalas(1);
		s1.disparar(s2);
		
		int balasEsperadas = 0;
		int balasObtenidas = s1.getNumeroBalas();
		
		assertEquals(balasEsperadas, balasObtenidas);
		
		boolean muerteEsperada = true;
		boolean muerteObtenida = s2.isEstaMuerto();
		
		assertEquals(muerteEsperada, muerteObtenida);
		
	}
	
}
