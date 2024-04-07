
package clases;

public class PasajeroLO extends Pasajero{
    //Atributos de la clase
    private String dia_salida;
    

    public PasajeroLO(String dia_salida, String num_ident, String destino, String nombre) {
        super(num_ident, destino, nombre);
        this.dia_salida = dia_salida;
        
    }
    
    
}
