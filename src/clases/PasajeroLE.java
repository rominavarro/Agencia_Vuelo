
package clases;

/**
 *
 * @author Romi PC
 */
public class PasajeroLE extends Pasajero{
    //Atributos de la clase
    private String p_destino;
    
    //Metodo constructor

    public PasajeroLE(String p_destino, String num_ident) {
        super(num_ident);
        this.p_destino = p_destino;
    }
    
    
}
