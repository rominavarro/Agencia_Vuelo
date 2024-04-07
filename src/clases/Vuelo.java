
package clases;

public abstract class Vuelo {
    
    //Atributos de la clase
    protected String num_vuelo;
    protected String destino;
    protected String piloto;
    protected int cant_asientos;
    protected float km_recorridos;
    
    
      //Metodo constructor
    public Vuelo(String num_vuelo, String destino, String piloto, int cant_asientos, float km_recorridos) {
        this.num_vuelo = num_vuelo;
        this.destino = destino;
        this.piloto = piloto;
        this.cant_asientos = cant_asientos;
        this.km_recorridos = km_recorridos;
    }
    //Metodos getter and setter
    public String getNum_vuelo() {
        return num_vuelo;
    }

    public void setNum_vuelo(String num_vuelo) {
        this.num_vuelo = num_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getCant_asientos() {
        return cant_asientos;
    }

    public void setCant_asientos(int cant_asientos) {
        this.cant_asientos = cant_asientos;
    }
    
    //Metodo precio del boleto
    public abstract float CalcularPrecioBoleto();
    
}
