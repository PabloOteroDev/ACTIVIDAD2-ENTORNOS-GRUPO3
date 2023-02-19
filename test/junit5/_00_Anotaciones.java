package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * @author Ignacio Martín Roque
 * 
 * Para generar una clase de pruebas, botón derecho | New | Other | Buscas JUnit Case y añades |
 * para crear otra ya te saldra en el menu debajo de Untitled Text File
 * 
 * 
 * 
 */


class _00_Anotaciones {
	
	//Este método con la anotación @BeforeAll se va a ejecutar antes que todos
	//Los Test (métodos anotados con @Test) Solo se pone una vez esta anotación 
	
	@BeforeAll
	static void setUpBeforeClass () throws Exception {
		System.out.println("MÉTODO QUE SE EJECUTA UNA VEZ Y AL PRINCIPIO");
	}
	
	//El método con la anotación @AfterAll se ejecutará después de todos los test
	
	@AfterAll
	static void tearDownAfterClass () throws Exception {
		System.out.println("MÉTODO QUE SE EJECUTA UNA VEZ Y AL FINAL");
	}
	
	//El método con la anotación @BeforeEach será ejecutado antes de cada uno de los test
	// Se ejecutará antes de test1 y antes de test2 - Es decir, dos veces
	
	@BeforeEach
	void setUp ()throws Exception {
		System.out.println("ESTE MÉTODO SE EJECUTARÁ UNA VEZ ANTES DE CADA TEST");
	}

	// El método con la anotación @AfterEach será ejecutado después de cada uno de los test
	//Se ejecutará después de del test1 y después del test2
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("ESTE MÉTODO SE EJECUTARÁ UNA VEZ DESPUÉS DE CADA TEST");
	}
	
	/*
	 * Estos son los métodos que ejecutaran las pruebas unitarias
	 * Son métodos con las anotaciones @Test y podemos tener tantos como queramos
	 */
	
	@Test
	void test1() {
		System.out.println("Comprobando el test1");
	}
	
	@Test
	void test2() {
		System.out.println("Comprobando el test2");
	}
	
	/*
	 * El ciclo de vida de la anotaciones sería el siguiente 
	 * 1º BeforeAll
	 * 2º BeforeEach
	 * 3º Test1
	 * 4º AfterEach
	 * 5º BeforeEach
	 * 6º Test2
	 * 7º AfrteEach
	 * 8º AfterAll
	 */

}



