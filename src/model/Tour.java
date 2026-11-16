package model;

/**
 * Representa un tour ofrecido por la agencia Llanquihue Tour.
 */

public class Tour {
    //ATRIBUTOS
    private String nombre;
    private String tipo;
    private String destino;
    private double precio;

    //CONSTRUCTOR SIN PARÁMETROS
    public Tour(){
        this.nombre = "";
        this.tipo = "";
        this.destino = "";
        this.precio = 0.0;
    }

    //CONSTRUCTOR CON PARÁMETROS
    public Tour(String nombre, String tipo, String destino, double precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.destino = destino;
        this.precio = precio;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //TO STRING
    @Override
    public String toString(){
        return "Tour: " + nombre
                + " | Tipo: " + tipo
                + " | Destino: " + destino
                + " | Precio: " + precio;
    }
}
