
package Tpo2;

public class Auto extends Vehiculo{

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
    

    @Override
    public float calculoCostoCombustible() {
       return  (float) (0.07*combustible.getPrecio());
    }

    @Override 
    public float precioPeaje() {
     return 100;
    }
    
    
    
    
    
}
