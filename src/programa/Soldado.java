package programa;

/*
 * Clase que representa a un soldado con dos atributos: le han matado y las balas
 * 
 * 
 * 
* @author Ignacio Martín Roque
* @version 1.0
 */


public class Soldado {
	
	private boolean estaMuerto;
	
	/*
	 * El soldado se puede morir
	 */
	
	private int numeroBalas;
	
	/*
	 * El soldado si tiene balas se puede defender 
	 * si no tiene balas no se puede defender y le matan 
	 */
	
	/*
	 * El primer método del soldado que puede disparar 
	 * Si el soldado tiene balas nos dará true y podrá disparar
	 * Si el soldado no tiene balas, es decir menor que 0 no podrá disparar. 
	 */
	
	  public boolean puedeDisparar() {

          if(this.numeroBalas > 0) {

                        return true;

          }                          

          return false;
	  }
	  
	  
          
         /*
          * El segundo método del soldado si tiene balas puede defenderse 
          * No tiene balas le matan y nos devuelve true 
          */
          
	  public void disparar(Soldado sol) {

          this.numeroBalas--;

          sol.estaMuerto = true;

}






	
	//Creamos los getter & setter

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
	
	
	
	
	

}
