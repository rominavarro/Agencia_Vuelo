
package clases;

public class PasajeroLO extends Pasajero{
    //Atributos de la clase
    private String dia_salida;
    private String destino;

    public PasajeroLO(String dia_salida, String destino, String num_ident) {
        super(num_ident);
        this.dia_salida = dia_salida;
        this.destino = destino;
    }
    
    
}
