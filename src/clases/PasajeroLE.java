
package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PasajeroLE extends Pasajero{
    //Atributos de la clase
    List <PasajeroLE> ListaEspera = cargarPasajerosEsperaDesdeArchivo("ListaEspera.txt");
    
    
    //Metodo constructor
    public PasajeroLE(String num_ident, String destino, List ListaEspera) {
        super(num_ident, destino);
        this.ListaEspera = ListaEspera;
    }

    public List<PasajeroLE> getListaEspera() {
        return ListaEspera;
    }

    public void setListaEspera(List<PasajeroLE> ListaEspera) {
        this.ListaEspera = ListaEspera;
    }

    
    
    //Fichero
    //Metodo para hacer el fichero
    
    public List<PasajeroLE> cargarPasajerosEsperaDesdeArchivo(String archivo) {

    List<PasajeroLE> pasajerosEspera = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

        String linea;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split(",");

            int identidad = Integer.parseInt(datos[0]);

            String[] destinos = Arrays.copyOfRange(datos, 1, datos.length);

            PasajeroLE pasajeroEspera = new PasajeroLE(identidad, destinos);

            pasajerosEspera.add(pasajeroEspera);

        }

    } catch (IOException e) {

        e.printStackTrace();

    }
    return pasajerosEspera;
}
    
    //Metodo para Guardar en Fichero
   
    public void guardarPasajerosEsperaEnArchivo(List<PasajeroLE> pasajerosEspera, String archivo) {

    try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {

        for (PasajeroLE pasajero : pasajerosEspera) {

            pw.println(pasajero.getNum_ident() + "," + String.join(",", pasajero.getDestino()));

        }

    } catch (IOException e) {

        e.printStackTrace();

    }

}
    
    
}
