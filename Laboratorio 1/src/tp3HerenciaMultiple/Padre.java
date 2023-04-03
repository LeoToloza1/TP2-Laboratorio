
package tp3HerenciaMultiple;

public abstract class Padre {
    
   private String nombre;
   private String apellido;
   private String casa;

    public Padre() {
        this.nombre = "papá";
        this.apellido = "lopez";
        this.casa=casa;
        
    }

   public abstract void tieneCasaZonaCentro(String casa);
           
   public abstract void canta();
   
   public abstract void tieneAuto();
   
   
   
   
   
}
