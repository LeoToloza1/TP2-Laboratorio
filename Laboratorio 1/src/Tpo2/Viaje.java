package Tpo2;

public class Viaje {

    private Ciudad origen;
    private Ciudad destino;
    private double distancia;
    private int peajes;
    private Vehiculo vehiculo;

    public Viaje(Ciudad origen, Ciudad destino, double distancia, int peajes, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.peajes = peajes;
        this.vehiculo = vehiculo;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int peajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.peajes = peajes;
        this.distancia = destino.getKilometro() - origen.getKilometro();
    }

    public float calculoDeDistancia() {
        distancia = destino.getKilometro() - origen.getKilometro();
        return (float) distancia;
    }

    public float calculoPeaje() {
        return (float) (vehiculo.precioPeaje() * peajes);
    }

    public float calculoCostoCombustible() {
        float valor=(float)(calculoDeDistancia() * vehiculo.calculoCostoCombustible());
        return  valor;
    }

    public float costoTotal() {
        double valor = calculoPeaje() + calculoCostoCombustible();
        return (float) valor;
    }

    public float getDistancia() {
        return (float) distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getPeajes() {
        return peajes;
    }

    public void setPeajes(int peajes) {
        this.peajes = peajes;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Viaje{" + "origen=" + origen + ", destino=" + destino + ", distancia=" + distancia + ", peajes=" + peajes + ", vehiculo=" + vehiculo + '}';
    }
    
    
}
