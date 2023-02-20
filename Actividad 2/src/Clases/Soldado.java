package Clases;

/**
 * <br>
 * la clase soldado es una algoritmo que nos dice si un objeto que le demos de clase soldado
 * esta muerto y si puede disparar segun si tiene balas o no.
 * <br>
 * <b>Atributos de la clase</b>
 * <ul>
 * <li>
 * uno de tipo boolena para saber si esta muerto o no y
 * otro de tipo integer con el numero de balas que tiene.
 * </li>
 * 
 * @author Donato Uechi
 * @version 1.0
 *
 */

public class Soldado {
	
	private boolean estaMuerto;
	private int numeroBalas;

	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	
	// Constructor vacio
	
	public Soldado() {
		super();
	}
	
	// Constructor con los parametros  estaMuerto y numeroBalas
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}

	
	/**
	 * Metodo que devuelve si el soldado puede disparar en base al numero de balas
	 * que tiene
	 * 
	 * @param numeroBalas nos indica la cantidad de balas que tiene el soldado
	 * @return si el numero de balas es menor o igual a 0 devuelve falso, si es mayor a 0 
	 * devuelve verdadero
	 */
	public boolean puedeDisparar() {
		if(this.numeroBalas > 0 ) {
			return true;
		}
		return false;
	}
	
	
	
	/**
	 * este metodo no devuelve nada disminuye en 1 el numeroBalas y el atributo estaMuerto
	 * del objeto sol de clase Soldado se convierte a verdadero.
	 * @param sol es de clase Soldado con todos sus atributos

	 * @author Donato Uechi
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
}
