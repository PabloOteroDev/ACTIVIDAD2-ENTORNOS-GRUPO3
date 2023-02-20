package entidades;

/**
 * Clase que encapsula la información sobre un soldado.
 * Tendrá dos métodos, en los cuales se informa sobre si está muerto y el 
 * número de balas que puede disparar
 * 
 * @author Miguel García
 * @since 18/02/2023
 * @version 1.0
 */

public class Soldado {
	
	 /**
	    * Indica el estado del soldado, true si está muerto
	    * y false si no lo está (boolean)
	    */
	
	   private boolean estaMuerto;

	  /**
	   * Número entero de balas 
	   */
	   
       private int numeroBalas;
       
       /**
        * Constructor de la clase <b> Soldado </b> con sus atributos.
        *  
        * @param estaMuerto
        * @param numeroBalas
        */
       public Soldado() {
   		// TODO Auto-generated constructor stub
   	}
       
       public Soldado(boolean estaMuerto, int numeroBalas) {
   		super();
   		this.estaMuerto = estaMuerto;
   		this.numeroBalas = numeroBalas;
   	} 
     	
       /* 
        * Getter and setter
        */
       
    

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
       
       
       /**
        * Método que establece si el soldado puede disparar o no en base al número de 
        * balas. El valor del número de balas ha de ser positivo y mayor de 0 para que
        * el resultado sea true, de lo contrario devolverá false, lo que significa que no puede disparar.
        * 
        * @return Si el soldado puede disparar devuelve <b> true </b>, de lo contrario devolvera <b> false </b>.
        * 
        * @author Miguel G.
        */
   	
       public boolean puedeDisparar() {
    	   
           if(this.numeroBalas > 0) {
           return true;
           }        
           return false;

}
       /**
        * Método que reduce el número de balas en una unidad cada vez que dispara. 
        * Además hace que el atributo booleano "estaMuerto" devuelva true solamente, indica que el 
        * soldado siempre va a estar muerto.
        * 
        * @param sol objeto de la clase Soldado. 
        * @author Miguel G.
        */
       public void disparar(Soldado sol) {
    	   
           this.numeroBalas--;

           sol.estaMuerto = true;
}

   

}