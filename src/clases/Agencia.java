
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
    
       
    // Quitar un pasajero de la lista
    public static void EliminarPasajero (int posicion) {
        ListaPasajero.remove(posicion);
    }
    
    // Devuelve un elemento de la lista dada su posicion
    public static Pasajero getPasajero (int posicion) {
        return ListaPasajero.get(posicion);
    }

    //Separar los pasajeros en las listas correspondientes
/*
    public List<PasajeroLO> ConocerPasajerosOficiales(List<Pasajero> listaPasajeros) {

        List<PasajeroLO> pasajerosOficiales = new ArrayList<>();

        for (Pasajero pasajero : Agencia.ListaPasajero) {

            if (pasajero instanceof PasajeroLO) {

                pasajerosOficiales.add((PasajeroLO) pasajero);

            }
        }
        return pasajerosOficiales;
    }


    public List<PasajeroLE> ConocerPasajerosEspera(List<PasajeroLE> listaPasajeros) {

        List<PasajeroLE> pasajerosEspera = new ArrayList<>();

        for (Pasajero pasajero : Agencia.ListaPasajero) {

            if (pasajero instanceof PasajeroLE) {

                pasajerosEspera.add((PasajeroLE) pasajero);

            }
        }
        return pasajerosEspera;
    }
*/
   
    //Segundo inciso: Cuantos pasajeros solicitaron un mismo destino y devolver una lista de IDs
    /*Metodo para contar cuantos pasajeros eligieron el mismo destino
    y devolver una lista con sus ID*/
    //REVISION
    
    public List<Pasajero> ContarPasajerosxDestino (String destino) {
    
        List<Pasajero> ListaID = new ArrayList<>(); 
           
            for (Pasajero pasajero : Agencia.ListaPasajero) {
                
                if(destino.equalsIgnoreCase(pasajero.getDestino()));
                    ListaID.add(pasajero.getNum_ident());
            }
    return ListaID;
}
            
    //Tercer inciso: Buscar en cual vuelo viajo determinado pasajero       
    //Metodo para buscar en que vuelo viajo determinado pasajero
    //Revision
    public static String EncontrarVueloPorPasajero(String numIdent) {

    for (Pasajero pasajero : Vuelo.ListaPasajero)
        for (Vuelo vuelo : Agencia.ListaVuelo) {
       
            if (pasajero.getNum_ident().equalsIgnoreCase(numIdent)) {
                return vuelo.getNum_vuelo();
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
    public double CalcularIngresoxVuelo(String num_vuelo) {
        double precio = 0;
        
        if (num_vuelo instanceof Vuelo_Comercial) {
            
            Vuelo_Comercial vueloComercial = (Vuelo_Comercial) vuelo;
            int asientosVendidos = vueloComercial.getCant_asientos();
            int asientosRestantes = asientosVendidos > Agencia.ListaPasajero.size() ? 0 : Agencia.ListaPasajero.size() - asientosVendidos;
            precio = asientosVendidos * vueloComercial.CalcularPrecioBoleto();
            
            for (int i = 0; i < asientosRestantes; i++) {
                precio += vueloComercial.CalcularPrecioBoleto();
            }
            
        } else if (num_vuelo instanceof Vuelo_Privado) {
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
    

