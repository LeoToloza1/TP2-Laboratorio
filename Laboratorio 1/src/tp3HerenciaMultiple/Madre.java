
package tp3HerenciaMultiple;

public abstract class Madre {
    
    private String nombre;
    private String apellido;
    private double dinero=400000;

    public Madre() {
        this.nombre = "rosa";
        this.apellido = "lopez";
    }
    
    public abstract void seBailar();
    
    public abstract void tengoDinero();
    
        
    
}
