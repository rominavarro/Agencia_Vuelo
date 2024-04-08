
package clases;

import java.util.List;

public class Vuelo_Comercial extends Vuelo{
    //Atributos clase 
    private String hora_salida;
    
    
    //Metodo Constructor

    public Vuelo_Comercial(String hora_salida, String num_vuelo, String destino, String piloto, int cant_asientos, float km_recorridos, List ListaPasajero) {
        super(num_vuelo, destino, piloto, cant_asientos, km_recorridos, ListaPasajero);
        this.hora_salida = hora_salida;
    }
    
    //Metodos Getter y Setter

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }
    
    //Metodo para precio del boleto

    @Override  
    public float CalcularPrecioBoleto(){

        return km_recorridos*5;
    }
}
