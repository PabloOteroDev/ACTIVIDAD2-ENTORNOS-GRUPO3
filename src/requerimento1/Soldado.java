package requerimento1;

/**
 * Primer requerimento de la Actividad 2
 * Se aporta código como parte del enunciado, dos métodos, los cuales
 * realizan tres funciones fundamentales, a saber:
 * 1 : comprobar si el número de balas es superior a 0, y por tanto
 *     si el soldado puede disparar.
 * 2 : reducir en una unidad el número de balas al disparar.
 * 3 : cambiar el contenido de la variable booleana estaMuerto a true. 
 * 
 * Se plantean una serie de pruebas para testar el código, así como la
 * documentación del mismo mediante los estándares JavaDoc. 
 * Siguiendo el consejo del profesor, no se han documentado los getter
 * y setter del constructor. 
 * 
 * @author José Pablo Otero
 * @version 1.0
 * 
 */

public class Soldado {
	/**
	 * Estado de vida o muerte
	 * booleano
	 */
    private boolean estaMuerto;

    /**
     * Número de balas
     * numero entero
     */
    private int numeroBalas;
    
    /**
     * Constructor de la clase Soldado.
     * 
     * @param estaMuerto estado del soldado, true para muerto, false para vivo
     * @param numeroBalas cuántas balas le quedan al soldado
     */
    
    
    public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
    
   
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
 * Método que comprueba si es posible disparar. Para esto, hay que tener
 * balas, es decir, el número de balas ha de ser superior a 0. 
 * Si efectivamente hay valas, recibimos un valor true.
 * En caso de que esto no ocurra, recibiríamos un valor false.
 * 
 * @return el booleano que confirma o niega que haya balas
 */

	public boolean puedeDisparar() {

        if(this.numeroBalas > 0) {

        return true;

        }                          

        return false;
        
    }
	
/**
 * Método que reduce el número de balas en 1 por cada vez que se 
 * dispara (como es lógico) y que además hace que el atributo estaMuerto
 * en el soldado sea verdad, es decir, sitúa el estatus del objeto
 * soldado como muerto.
 * 
 * @param sol el soldado que va a morir trágicamente.
 */

    public void disparar(Soldado sol) {

        this.numeroBalas--;

        sol.estaMuerto = true;

    }

}