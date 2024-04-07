
package clases;

public abstract class Pasajero {
    //Atributos de la clase
    protected String num_ident;
    
    
    //Metodo Constructor

    public Pasajero(String num_ident) {
        this.num_ident = num_ident;
    }
    
    //Metodos Getter and Setter

    public String getNum_ident() {
        return num_ident;
    }

    public void setNum_ident(String num_ident) {
        this.num_ident = num_ident;
    }
        
}
