package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import programa.Jugador;

class JugadorTest {
		
	private Jugador j1;
	
	@BeforeEach
	//Me interesa antes de cada test tener un objeto jugador
	//limpio (nuevo)
	void setUp()throws Exception {
		j1 = new Jugador ();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		j1 = null;
	}
	
	/*
	 * Para el método setDorsal probamos cuatro casos, uno cuando 
	 * le pasamos un dorsal positivo,un dorsal negativo, otro 0 y superior a 30
	 */
	
	@Test 
	public void elegirDorsal() {
	Jugador jugador = new Jugador ();
	jugador.setDorsal(1);
	
	int resultadoEsperado = 1;
	int resultado = jugador.getDorsal();
	
	assertEquals(resultadoEsperado, resultado);
	}
	
	@Test 
	public void elegirDorsalNegativo () {
		Jugador jugador = new Jugador ();
		jugador.setDorsal(-5);
		
		int resultadoEsperado = -5; 
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	public void elegirDorsalCero () {
		Jugador jugador = new Jugador ();
		jugador.setDorsal(0);
		
		int resultadoEsperado = 0;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void elegirDorsalMayorDeTreinta () {
		Jugador jugador = new Jugador ();
		jugador.setDorsal(35);
		 
		int resultadoEsperado = 35;
		int resultado = jugador.getDorsal();
		
		assertEquals(resultadoEsperado, resultado);
		
	}
		
		/*
		 * Para el método esta expulsado debemos de probar tres casos
		 * ya que hay 3 opciones por las que tenemos que pasar
		 * 
		 * vamos a probar que le sacan 2 tarjetas amarillas y esta expulsado
		 */
	@Test
	public void testTarjetasAmarillas() {
		Jugador jugador = new Jugador ();
		jugador.setNumeroTarjetasAmarillas(2);
		
		//Ahora el resultado esperado es que el jugador este expulsado
		assertTrue(jugador.estaExpulsado());
	}
	
	/**
	 * Aquí vamos a probar que le han sacado 1 tarjeta roja
	 * por lo que esta expulsado
	 */
	
	@Test 
	public void testTarjetasRojas() {
		Jugador jugador = new Jugador ();
		jugador.setNumeroTarjetasRojas(1);
		
		//Ahora el resultado esperado es que el jugador ha sido expulsado
		
		assertTrue(jugador.estaExpulsado());
	}
	
	/**
	 * Aquí vamos a probar que le han sacado 1 tarjeta amarilla 
	 * por lo que no esta expulsado
	 */
	
	@Test
	public void testUnaTarjetaAmarilla() {
		Jugador jugador = new Jugador ();
		jugador.setNumeroTarjetasAmarillas(1);
		
		//Ahora el resultado esperado es que el jugador tiene una tarjeta amarilla
		//pero no ha sido expulsado
		
		assertFalse(jugador.estaExpulsado());
	}
	
	
	
	}


