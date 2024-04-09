
package clases;

import java.util.ArrayList;
import java.util.List;

public class PasajeroLO extends Pasajero{
    //Atributos de la clase
    private String dia_salida;
    List<Pasajero> ListaOficial = new ArrayList<>();
    

    public PasajeroLO(String dia_salida, String num_ident, String destino, List ListaOficial) {
        super(num_ident, destino);
        this.dia_salida = dia_salida;
        this.ListaOficial = ListaOficial;
        
    }

    public List<Pasajero> getListaOficial() {
        return ListaOficial;
    }

    public void setListaOficial(List<Pasajero> ListaOficial) {
        this.ListaOficial = ListaOficial;
    }

    public String getDia_salida() {
        return dia_salida;
    }

    public void setDia_salida(String dia_salida) {
        this.dia_salida = dia_salida;
    }
    
    
    
}
