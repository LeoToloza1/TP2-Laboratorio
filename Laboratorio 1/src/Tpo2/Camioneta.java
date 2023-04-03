
package Tpo2;

public class Camioneta extends Vehiculo{

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    

    @Override
    float calculoCostoCombustible() {
       return  (float) (0.10 *combustible.getPrecio());
    }

    @Override
    float precioPeaje() {
     return 110;
    }

    
}
