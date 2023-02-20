package junit5;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Soldado;

class TestSoldado {

	@BeforeEach
	void setUp() throws Exception {
		Soldado s = new Soldado();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		Soldado s = null;
	}
	
	@Test
	public void puedeDispararTest () {
		System.out.println("test 1");		
		Soldado s = new Soldado();
		s.setNumeroBalas(20);
		
		
		assertTrue(s.puedeDisparar());		
	}

	@Test
	public void noPuedeDispararTest () {
		System.out.println("test 2");		
		Soldado s = new Soldado();
		s.setNumeroBalas(0);	
				
		assertFalse(s.puedeDisparar());
	}
	
	@Test
	public void testEstaMuerto () {
		Soldado s = new Soldado();
		s.setEstaMuerto(true);
		s.setNumeroBalas(0);
		
		assertTrue(s.isEstaMuerto());
	}
	
	@Test
	public void testNoEstaMuerto () {
		System.out.println("test 4");
		Soldado s = new Soldado();
		s.setNumeroBalas(100);
		s.setEstaMuerto(false);
		
		assertFalse (s.isEstaMuerto());		
	}
	
	@Test
	public void testEstaMuertoConbalas () {
		System.out.println("test 5");	
		Soldado s = new Soldado();
		s.setNumeroBalas(22);
		s.disparar(s);
		
		assertTrue (s.isEstaMuerto());			
	}
	
	@Test
	public void testEstaMuertoSinbalas () {
		System.out.println("test 6");
		Soldado s = new Soldado();
		s.setNumeroBalas(0);
		s.disparar(s);
		
		assertTrue (s.isEstaMuerto());	
	}
}
