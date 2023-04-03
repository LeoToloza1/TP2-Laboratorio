
package Tpo2;

public class Camion extends Vehiculo{

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
 
    @Override
    float calculoCostoCombustible() {
       return (float) (1.12 * combustible.getPrecio());
    }

    @Override
    float precioPeaje() {
     return 150;
    }
}
