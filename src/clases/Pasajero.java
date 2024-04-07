
package clases;

public abstract class Pasajero {
    //Atributos de la clase
    protected String num_ident;
    protected String destino;
    protected String nombre;
    
    
    //Metodo Constructor

    public Pasajero(String num_ident, String destino, String nombre) {
        this.num_ident = num_ident;
        this.destino = destino;
        this.nombre = nombre;
    }
    
    //Metodos Getter and Setter

    public String getNum_ident() {
        return num_ident;
    }

    public void setNum_ident(String num_ident) {
        this.num_ident = num_ident;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
}
