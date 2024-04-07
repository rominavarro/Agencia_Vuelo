
package clases;
//La clase Agencia seria la clase controladora 

import java.util.List;
import java.util.ArrayList;

public class Agencia {
    //Atributos de la clase
    private String nombre;
    private String direccion;
    static List<Pasajero> ListaOficial;
    static List<Pasajero> ListaEspera;
    
    //Metodo Constructor

    public Agencia(String nombre, String direccion, List ListaOficial, List ListaEspera) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ListaEspera = new ArrayList<>();
        this.ListaOficial = new ArrayList<>();
        
    }
    
    //Metodo para agregar un nuevo pasajero
    public static void AgregarPasajeroOficial(Pasajero pasajero) {
        ListaOficial.add(pasajero);
    }
    
    public void AgregarPasajeroEspera(Pasajero pasajero) {
        ListaEspera.add(pasajero);
    }
    
    
}
