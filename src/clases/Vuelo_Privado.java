
package clases;

public class Vuelo_Privado extends Vuelo{
    //Atributos de la clase
    private String hora_llegada;
    
    //Metodo constructor

    public Vuelo_Privado(String hora_llegada, String num_vuelo, String destino, String piloto, int cant_asientos, float km_recorridos) {
        super(num_vuelo, destino, piloto, cant_asientos, km_recorridos);
        this.hora_llegada = hora_llegada;
    }
    
    //Metodos Getter y Setter

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }
    
    //Metodo para el precio del boleto
    
    @Override
    public float CalcularPrecioBoleto(){
        float precio=0;
        
        if(km_recorridos<500)
        {
            precio = 50;
        }
        else if(km_recorridos>500&&km_recorridos<1000)
        {
            precio = 100;
        }
        else
        {
            precio = 150;
        }
        
        return precio;
    }
}
