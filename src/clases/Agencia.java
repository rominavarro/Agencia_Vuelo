
package clases;
//La clase Agencia seria la clase controladora 

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Agencia {
    //Atributos de la clase
    private String nombre;
    private String direccion;
    private static List<Pasajero> ListaOficial;
    private static List<Pasajero> ListaEspera;
    private static List<Pasajero> ListaPasajero;
    public static List<Vuelo> ListaVuelos = new ArrayList<>();
    
    //Metodo Constructor

    public Agencia(String nombre, String direccion, List ListaOficial, List ListaEspera, List Pasajero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ListaEspera = ListaEspera;
        this.ListaOficial = ListaOficial;
        this.ListaPasajero = ListaPasajero;
        
    }
    
    //Metodo para agregar un nuevo pasajero
    public static void AgregarPasajeroOficial(Pasajero pasajero) {
        ListaOficial.add(pasajero);
    }
    
    public void AgregarPasajeroEspera(Pasajero pasajero) {
        ListaEspera.add(pasajero);
    }
    
    /*Metodo para contar cuantos pasajeros eligieron el mismo destino
    y devolver una lista con sus ID*/
    
    public static List<Pasajero> ContarPasajerosxDestino (List ListaOficial){
        //List <Pasajero> res = new ArrayList <>();
        int c=0;
        for(PasajeroLE)
        
        return ;
    } 
    
    public static List<Pasajero> ContarPasajeroxDestino(List ListaEspera){
        
    }
    
    //Metodo para buscar en que vuelo viajo determinado pasajero
    public String BuscarVueloxPasajero(String nombre){
        String message=JOptionPane.showInputDialog("Teclee el nombre a buscar");
        
        for (Vuelo i: Agencia.ListaVuelos)
        {
            for (Pasajero j: Agencia.ListaPasajero)
            {
                if(message instanceof )
            }
        }
    }
    
    //Metodo para calcular el ingreso de un vuelo especifico
    public float CalcularIngresoxVuelo(String num_vuelo)
    {
        for (Vuelo i: Agencia.ListaVuelos)
        {
            if(num_vuelo instanceof Vuelo)
            {
                
            }
        }
    }
}
