
package clases;
//La clase Agencia seria la clase controladora 

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Agencia {
    //Atributos de la clase
    private String nombre;
    private String direccion;
    private static List<Pasajero> ListaPasajero = new ArrayList<>();
    public static List<Vuelo> ListaVuelo = new ArrayList<>();
    
  
    //Primer inciso: Las dos listas donde se registran los pasajeros
    //Metodo para agregar un nuevo pasajero
    //METODO COMPLETADO
    public static void AgregarPasajero(Pasajero pasajero) {
        ListaPasajero.add(pasajero);
    }
    
    /*public void AgregarPasajeroEspera(Pasajero pasajero) {
        ListaEspera.add(pasajero);
    }*/
    
    
    //Segundo inciso: Cuantos pasajeros solicitaron un mismo destino y devolver una lista de IDs
    /*Metodo para contar cuantos pasajeros eligieron el mismo destino
    y devolver una lista con sus ID*/
    
   
}
            
    //Tercer inciso: Buscar en cual vuelo viajo determinado pasajero       
    //Metodo para buscar en que vuelo viajo determinado pasajero
    public static Vuelo encontrarVueloPorPasajero(String numIdent) {
    for (Vuelo vuelo : Agencia.ListaVuelo) {
        for (Pasajero pasajero : vuelo.getListaPasajeros()) {
            if (pasajero.getNum_ident().equalsIgnoreCase(numIdent)) {
                return vuelo;
            }
        }
    }
    return null;
}
    
    //Cuarto inciso: Conocer la informacion de todos los vuelos que van a un mismo destino
    //Metodo para conocer todos los datos de todos los vuelos que van a un mismo destino
    //METODO COMPLETADO!
    public List<Vuelo> ConocerVueloxDestino(String destino) {
    List<Vuelo> vuelos_dest = new ArrayList<>();
    for (Vuelo vuelo : vuelos_dest) {
        if (vuelo.getDestino().equalsIgnoreCase(destino)) {
            vuelos_dest.add(vuelo);
        }
    }
    return vuelos_dest;
}
    //Quinto inciso: Dado un vuelo, decir cuales fueron sus ingresos
    //Metodo para calcular el ingreso de un vuelo especifico
    //REVISION
    public double CalcularIngresoxVuelo(Vuelo vuelo) {
        double precio = 0;
        
        if (vuelo instanceof Vuelo_Comercial) {
            
            Vuelo_Comercial vueloComercial = (Vuelo_Comercial) vuelo;
            int asientosVendidos = vueloComercial.getCant_asientos();
            int asientosRestantes = asientosVendidos > Agencia.ListaPasajero.size() ? 0 : Agencia.ListaPasajero.size() - asientosVendidos;
            precio = asientosVendidos * vueloComercial.CalcularPrecioBoleto();
            
            for (int i = 0; i < asientosRestantes; i++) {
                precio += vueloComercial.CalcularPrecioBoleto();
            }
            
        } else if (vuelo instanceof Vuelo_Privado) {
            Vuelo_Privado vueloPrivado = (Vuelo_Privado) vuelo;
            
            for (Pasajero pasajero : Agencia.ListaPasajero) {
                if (pasajero.getDestino().equals(vueloPrivado.getDestino())) {
                    precio += vueloPrivado.CalcularPrecioBoleto();
                }
            }
        }
        return precio;
    }
}
    

