package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Jugador;

class TestJugador {

	@BeforeEach
	void setUp() throws Exception {
		Jugador j = new Jugador();
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		Jugador j = null;
	}
	
	@Test
	public void testPonerDorsal() {
		// Número de dorsal entre 1 y 30
		
		System.out.println("test 1");		
		Jugador j = new Jugador ();
		j.ponerDorsal(17);
		
		int resultadoEsperado = 17;
		int resultadoObtenido = j.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	public void testPonerDorsalMayor() {
		//Número de dorsal mayor de 30
		
		System.out.println("test 2");		
		Jugador j = new Jugador ();
		j.ponerDorsal(55);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testPonerDorsalMenor() {
		//Número de dorsal menor de 1
		
		System.out.println("test 3");		
		Jugador j = new Jugador ();
		j.ponerDorsal(0);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = j.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testestaExpulsadoConAmarillas () {
		// Jugador expulsado con 2 tarjetas amarillas
		
		System.out.println("test 4");		
		Jugador j = new Jugador ();
		j.estaExpulsado();
		j.setNumeroTarjetasAmarillas(2);
		
		assertTrue (j.estaExpulsado());
	}
	
	@Test
	public void testNoEstaExpulsadoConAmarillas() {
		// Jugador no expulsado con 1 tarjeta amarilla 
		
		System.out.println("test 5");		
		Jugador j = new Jugador ();
		j.estaExpulsado();
		j.setNumeroTarjetasAmarillas(1);
		

		boolean resultadoEsperado = false;
		boolean resultadoObtenido = j.estaExpulsado();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testEstaExpulsadoConAmarillasMal() {
		// Jugador no expulsado con 8 tarjetas amarillas
		
		System.out.println("test 9");		
		Jugador j = new Jugador ();
		
		j.setNumeroTarjetasAmarillas(8);
		j.estaExpulsado();
		
		assertFalse (j.estaExpulsado());
	}

	@Test
	public void testNoEstaExpulsadoSinTarjetas() {
		// Jugador no expulsado porque no tiene tarjetas 
		
		System.out.println("test 6");		
		Jugador j = new Jugador ();
		j.estaExpulsado();
		j.setNumeroTarjetasAmarillas(0);
		j.setNumeroTarjetasRojas(0);
		
		assertFalse (j.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsadoConRoja() {
		// Jugador expulsado con 1 tarjeta roja
		
		System.out.println("test 7");		
		Jugador j = new Jugador ();
		j.setNumeroTarjetasAmarillas(0);
		j.setNumeroTarjetasRojas(1);
		j.estaExpulsado();
		
		assertTrue (j.estaExpulsado());
	}	
	
	@Test
	public void testEstaExpulsadoConRojaMal() {
		// Jugador no expulsado con 3 tarjetas rojas 
		
		System.out.println("test 8");		
		Jugador j = new Jugador ();
		
		j.setNumeroTarjetasRojas(3);
		j.estaExpulsado();
		
		assertFalse (j.estaExpulsado());
	}
	
	
	
	
}
