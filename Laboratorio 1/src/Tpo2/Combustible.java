package Tpo2;

public class Combustible {

    private String tipo;
    private float precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Combustible(String tipo, float precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Combustible{" + "tipo=" + tipo + ", precio=" + precio + '}';
    }

   
}
