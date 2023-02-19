package junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
 * Aserciones: Nos permiten verificar el valor del resultado esperado
 * Cuando hacemos una aserción esperamos una condición (Falso, true, igual a)
 * Se va a trabajar con resultados esperados y obtenidos (Tienen que ser iguales)
 * LAS ASERCIONES LAS METEMOS DENTRO DE LOS MÉTODOS DE PRUEBA, ES DECIR LOS MÉTODOS ANOTADOS 
 * CON @Test
 */



class _01_Aserciones {

	
	@Test
	public void acabaEnMundoTest () {
		System.out.println("Test 1");
		
		String palabra = "Hola mundo";
		assertTrue(palabra.endsWith("mundo"));
	}
	
	@Test
	public void noAcabaEnHolaTest () {
		System.out.println("Test 2");
		
		String palabra = new String ("Hola mundo");
		assertFalse(palabra.endsWith("Hola"));
		
		//Probamos que cuando la palabra este vacia nos devuelve TRUE
		assertTrue(palabra.endsWith(""));
	}
	
	@Test 
	public void esIgualTest() {
		System.out.println("Test 3");
		String palabra = "hola mundo";
		
		//Vamos a testear el método toUpperCase() de String
		
		String resultadoEsperado = "HOLA MUNDO";
		String resultadoObtenido = palabra.toUpperCase();
		assertEquals(resultadoEsperado,resultadoObtenido);
		
		
		}
	
	@Test
	public void noEsIgualTest() {
		System.out.println("Test 4");
		String palabra = "Hola Mundo";
		String resultadoNoEsperado = "HOLA MUNDO";
		String resultadoObtenido = palabra.toLowerCase();
		assertNotEquals(resultadoNoEsperado,resultadoObtenido);
	}
	
	
	
	
	@Test
	public void esNullTest () {
		System.out.println("Test 5");
		String palabra = null;
		
		assertNull(palabra);
	}

	@Test
	public void noEsNullTest () {
		System.out.println("Test 6");
		String palabra = new String ("Hola mundo");
		
		assertNotNull(palabra);
	}
	
	// También podemos hacer que ocurra alguna excepción
	
	@Test
	public void excepcionTest () {
		System.out.println("Test 7");
		
		String palabra = new String ("Hola mundo");
		
		// Hacemos una función lambda sobre el método que
		// queremos probar si lanza una excepción concreta
		
		assertThrows(
				IndexOutOfBoundsException.class,
				() -> palabra.charAt(20)); // REPRESENTACIÓN DE FUNCIÓN LAMBDA
		
		assertThrows(
				IndexOutOfBoundsException.class,
				() -> palabra.charAt(-1)); // REPRESENTACIÓN DE FUNCIÓN LAMBDA
		
		char caracterEsperado = 'o';
		char caracterObtenido = palabra.charAt(1);
		assertEquals(caracterEsperado,caracterObtenido);
		
	}
}
