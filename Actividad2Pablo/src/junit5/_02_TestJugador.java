package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import requerimento2.Jugador;


/**
 * 
 * @author 
 *
 */

public class _02_TestJugador {

	private Jugador j1;
	
	@BeforeEach
	void setUp() throws Exception {
		j1 = new Jugador(0, 0, 0);
		}
	
	@AfterEach
	void tearDown() throws Exception {
		j1 = null;
	}
	
	@Test //comprobar que funcionan getters y setters
	public void testSetDorsal() {
		j1.setDorsal(20);
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(1);
	
		int dorsalEsperado = 20;
		int dorsalObtenido = j1.getDorsal();
		int amarillaEsperado = 2;
		int amarillaObtenido = j1.getNumeroTarjetasAmarillas();
		int rojaEsperado = 1;
		int rojaObtenido = j1.getNumeroTarjetasRojas();
		
		assertEquals(dorsalEsperado, dorsalObtenido);
		assertEquals(amarillaEsperado, amarillaObtenido);
		assertEquals(rojaEsperado, rojaObtenido);
				
	}
	
	@Test //comprobar que funciona el primer método
	public void testPonerDorsalBien() {
		j1.ponerDorsal(20);
		
		int dorsalEsperado = 20;
		int dorsalObtenido = j1.getDorsal();
		
		assertEquals(dorsalEsperado, dorsalObtenido);

	}
	
	@Test //lo mismo pero con un número fuera de rango por grande
	public void testPonerDorsalMalGrande() {
		j1.ponerDorsal(40);
		
		int dorsalEsperado = -1;
		int dorsalObtenido = j1.getDorsal();
		
		assertEquals(dorsalEsperado, dorsalObtenido);

	}
	
	@Test //lo mismo pero con un número fuera de rango por pequeño
	public void testPonerDorsalMalPequeño() {
		j1.ponerDorsal(-10);
		
		int dorsalEsperado = -1;
		int dorsalObtenido = j1.getDorsal();
		
		assertEquals(dorsalEsperado, dorsalObtenido);

	}
	
	@Test //comprobar que funciona el segundo método, con amarillas
	public void testNoEstaExpulsadoAmarillaBien() {
		j1.setNumeroTarjetasAmarillas(1);
		boolean expulsionEsperada = false;
		boolean expulsionObtenida = j1.estaExpulsado();
		
		assertEquals(expulsionEsperada, expulsionObtenida);
	}
	
	@Test //comprobar que funciona el segundo método, con rojas
	public void testNoEstaExpulsadoRojaBien() {
		j1.setNumeroTarjetasRojas(0);
		boolean expulsionEsperada = false;
		boolean expulsionObtenida = j1.estaExpulsado();
		
		assertEquals(expulsionEsperada, expulsionObtenida);
	}
	
	@Test //comprobar que el segundo método expulsa, con amarillas
	public void testEstaExpulsadoAmarillaBien() {
		j1.setNumeroTarjetasAmarillas(2);
		boolean expulsionEsperada = true;
		boolean expulsionObtenida = j1.estaExpulsado();
		
		assertEquals(expulsionEsperada, expulsionObtenida);
	}
	
	@Test //comprobar que el segundo método expulsa, con rojas
	public void testEstaExpulsadoRojaBien() {
		j1.setNumeroTarjetasRojas(1);
		boolean expulsionEsperada = true;
		boolean expulsionObtenida = j1.estaExpulsado();
		
		assertEquals(expulsionEsperada, expulsionObtenida);
	}
	
	@Test //contratest para ver qué pasa con valores no esperados, con amarillas
	public void testEstaExpulsadoAmarillaMal() {
		j1.setNumeroTarjetasAmarillas(5);
		boolean expulsionEsperada = false;
		boolean expulsionObtenida = j1.estaExpulsado();
		
		assertEquals(expulsionEsperada, expulsionObtenida);
	}
	
	@Test //contratest para ver qué pasa con valores no esperados, con rojas
	public void testEstaExpulsadoRojaaMal() {
		j1.setNumeroTarjetasRojas(5);
		boolean expulsionEsperada = false;
		boolean expulsionObtenida = j1.estaExpulsado();
		
		assertEquals(expulsionEsperada, expulsionObtenida);
	}
}
