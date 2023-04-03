package Tpo2;

public class Ciudad {

    private String ciudad;
    private int ruta;
    private double kilometro;

    public Ciudad(String ciudad, int ruta, double kilometro) {
        this.ciudad = ciudad;
        this.ruta = ruta;
        this.kilometro = kilometro;
    }

  

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public double getKilometro() {
        return kilometro;
    }

    public void setKilometro(double kilometros) {
        this.kilometro = kilometros;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "ciudad=" + ciudad + ", ruta=" + ruta + ", kilometro=" + kilometro + '}';
    }
    
    
}
