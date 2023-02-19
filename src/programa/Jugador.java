package programa;
/*
* @author Ignacio Martín Roque
* @version 1.0
 */




public class Jugador {
	
	// ATRIBUTOS 
	/**
	 * El dorsal del jugador 
	 * Los dorsales van desde el número 1 al 30
	 */
	 private int dorsal;
	 
	/**
	 * Número de tarjetas amarillas que puede tener un jugador en un partido
	 */

     private int numeroTarjetasAmarillas;
     
     /*
      * Pueden darse dos situaciones o sacar tajeta roja directa  y es expulsado
      * o acumular dos tarjetas amarillas y se le saca la roja para expulsarle
      */

     private int numeroTarjetasRojas;
     
     
     /*
      * Primer método del jugador para que tenga un número de dorsal
      */

     public void ponerDorsal(int dorsal) {

         if(dorsal >= 1 && dorsal <= 30) {

                       this.dorsal = dorsal;

         }else {

                       this.dorsal = -1;

         }

}
     /*
      * Segundo método del jugador para sacarle tarjeta amarilla o roja
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
     //Creamos los Getters and Setter

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

}  
