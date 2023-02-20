package entidades;

/**
 * Clase que encapsula la información sobre un jugador. <br>
 * Tendrá dos métodos mediante los cuales se comprueba su número de dorsal
 * asignado y si el jugador está o no expulsado. <br>
 * 
 * Los atributos de clase: <b> dorsal, numeroTarjetasAmarillas, numeroTarjetasRojas. </b>
 * 
 * 
 * @author Miguel García
 * @since 19/02/2023
 * @version 1.0
 *
 */

public class Jugador {

	// Atributos privados de la clase Jugador.
	
	/**
	 * Número entero que informa del dorsal del jugador.
	 */
	
	 private int dorsal;
	 
	 /*
	  * Número entero que cuantifica las tarjetas amarillas que tiene el jugador.
	  */
	 
     private int numeroTarjetasAmarillas;
     
     /**
      * Número entero que cuantifica las tarjetas rojas que tiene el jugador.
      */
     
     private int numeroTarjetasRojas;
     
     /**
      * Constructor de la clase <b> Jugador </b> con sus atributos.
      * 
      * @param dorsal
      * @param numeroTarjetasAmarillas
      * @param numeroTarjetasRojas
      */
     
     public Jugador() {
 		super();
 	} 
     
     public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	//Getter and setter
     
    

	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * Método que se utiliza para establecer el número de dorsal del jugador.
	 * Se debe introducir un número entero de dorsal entre 1 y 30 y devuelve ese número entero.
	 * Si el número entero introducido no se encuentra entre el rango de 1 y 30, devuelve
	 * el valor asignado de -1.
	 * 
	 * @param Dorsal: número entero (int).	 * 
	 * @author Miguel G.
	 */
     
	public void ponerDorsal(int dorsal) {

            if(dorsal >= 1 && dorsal <= 30) {
               this.dorsal = dorsal;
            }else {
               this.dorsal = -1;
            }
     }
	
	/**
	 * Método que hace comprobaciones sobre si el jugador está expulsado mediante el control de numero de
	 * tarjetas amarillas y tarjetas rojas.<br> 
	 * Si el número de tarjetas amarillas es igual a 2, el jugador está expulsado, 
	 * al igual que si el número de tarjetas rojas es igual a 1, nos devuelve igualmente el boolean con resultado 
	 * true para confirmar que el jugador está expulsado.
	 * 
	 * @return <b> Expulsado</b>: devuelve un resultado <b>true</b> si el jugador está expulsado y <b>false</b>
	 *  si no lo está.
	 * 
	 * @author Miguel G.
	 */
	
     public boolean estaExpulsado() {

            boolean expulsado = false;                                                  

            if(numeroTarjetasAmarillas == 2) {
                    expulsado = true;
            }                  
            if(numeroTarjetasRojas == 1) {
                    expulsado = true;
            }                        
            return expulsado;
     }        
}
