package requerimento2;

/**
 * Segundo requerimento de la Actividad 2
 * Se aporta código como parte del enunciado, dos métodos, los cuales
 * realizan  funciones fundamentales, a saber:
 * 1 : comprobar si el número del dorsal de un jugador dado se sitúa entre
 * 	   1 y 30, ambos inclusive, y si se encontrase fuera del rango, le asigna
 * 	   un valor de -1. 
 * 2 : comprobar si un jugador está expulsado atendiendo a su número de tarjetas,
 *     tanto rojas como amarillas, de tal manera que con dos cartulinas amarillas
 *     el jugador queda expulsado, obteniendo el mismo resultado con una sóla
 *     tarjeta roja.
 * 
 * Se plantean una serie de pruebas para testar el código, así como la
 * documentación del mismo mediante los estándares JavaDoc. 
 * 
 * @author José Pablo Otero
 * @version 1.0
 * 
 */


public class Jugador {
	/**
	 * Número de dorsal del jugador
	 * entero
	 */
    private int dorsal;
    /**
	 * Contador de tarjetas amarillas del jugador
	 * entero
	 */
    private int numeroTarjetasAmarillas;
    /**
   	 * Contador de tarjetas rojas del jugador
   	 * entero
   	 */
    private int numeroTarjetasRojas;

    /**
     * Constructor de la clase Jugador
     * 
     * @param dorsal
     * @param numeroTarjetasAmarillas
     * @param numeroTarjetasRojas
     */
    
    public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

    


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
	 * Método que comprueba el número del dorsal del jugador en cuestión.
	 * Si se encuentra entre 1 y 30, asigna ese número al dorsal. Sin
	 * embargo, si está fuera de ese rango, le asigna el valor -1.
	 * 
	 * @param dorsal el número de dorsal (int)
	 */

	
	public void ponerDorsal(int dorsal) {

        if(dorsal >= 1 && dorsal <= 30) {

                      this.dorsal = dorsal;

        }else {

                      this.dorsal = -1;

        }

	}

	/**
	 * Método que comprueba si el jugador en cuestión está expulsado o no.
	 * Para esto, comprueba si tiene 2 tarjetas amarillas o 1 roja, en cualquiera
	 * de los dos casos asigna el valor true al boolean expulsado, y devuelve este
	 * valor.
	 * 
	 * @return expulsado, cuyo valor nos comunica si el jugador está en el 
	 * partido o se va a su casa.
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


                 

