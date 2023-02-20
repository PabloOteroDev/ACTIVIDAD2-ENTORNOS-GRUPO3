package Clases;

/**
 * <br>
 * la clase jugador tiene 3 atributos indica si el dorsal entra en elk rango permitido
 * o si no, y el numero de tarjetas amarillas y negras que segun sea 2 o 1 respectivamente
 * estara expulsado o no.
 * <br>
 * <b>Atributos de la clase</b>
 * @param dorsal es de tipo entero indica el numero de dorsal
 * @param numeroTarjetasAmarillas de tipo entero indica el numero de tarjetas amarillas
 *  que tiene el jugador
 * @param numeroTarjetasRojas de tipo entero indica el numero de tarjetas rojas
 *  que tiene el jugador
 * <ul>

 * @author Donato Uechi
 * @version 1.0
 *
 */

public class Jugador {
    private int dorsal;
    private int numeroTarjetasAmarillas;
    private int numeroTarjetasRojas;
 
      
    

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
	
	
	
	public Jugador() {
		super();
	}

	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	/**
	 * Metodo que se le asigna el mismo valor que se ingresa dorsal si el numero de dorsal 
	 * esta comprendido entre 1 y 30 de caso contrario se le asigna el valor de -1
	 * 
	 * @param dorsal es de tipo entero indica el numero de dorsal
	 */
    public void ponerDorsal(int dorsal) {
                  if(dorsal >= 1 && dorsal <= 30) {
                                this.dorsal = dorsal;
                  }else {
                                this.dorsal = -1;
                  }
    }

	/**
	 * Metodo que devuelve la variable expulsado como verdadero si el numero de tarjetas amarillas
	 * es igual a 2 o el numero de tarjetas rojas es igual a 1 de caso contrario devuelve falso
	 * 
	 * @param numeroBalas nos indica la cantidad de balas que tiene el soldado
	 * @return si el numero de balas es menor o igual a 0 devuelve falso, si es mayor a 0 
	 * devuelve verdadero
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
