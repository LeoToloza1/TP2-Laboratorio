


public class Robot {
    private boolean despierto;
    private Bateria bate;
    private int cpasos;
    private int recorrido;
    
    public Robot() {
        despierto=true;
        bate=new Bateria();
        cpasos=0;
        recorrido=0;
    }
    
    public void avanzar(int pasos)
    {int contador=1;
    //cpasos=cpasos+pasos;
   
    if (despierto )
    {  
        cpasos=cpasos+pasos;  
       
        if(bateriaVacia()){
           if (cpasos >=100)
           {   
                contador=cpasos;
               contador=contador/100;
               contador=contador*10;
               cpasos= cpasos % 100;
                  if (contador <= bate.getCarga())
                  {
                   // aca no creo un metodo para modificar la bateria por que el ejercicio no pide tener ese metodo en la bateria 
                      recorrido=recorrido +pasos;
                      bate.setCarga(bate.getCarga()-contador);
                      System.out.println("El robot avanzo con exito descontando: "+contador+" de energia su Bateria esta en : "+bate.getCarga()+" Su recorrido Total es : "+recorrido);
                     
                  }
           
                  else
                  {
                      System.out.println("no tiene carga suficiente, por favor cargue el robot ");
                  
                  }
           }
           else
           {  recorrido=recorrido +pasos;
             //cpasos=cpasos+pasos; 
             
           System.out.println("El robot avanzo sin consumir energia , el recorrido caminado es : "+recorrido );
           
           }
        }
        else
        {
            System.out.println("El robot no puede avanzar se quedo sin batería, por favor recargue");
        }
    }
    else
    {
    
        System.out.println("El robot esta apagado , Por favor enciendo el robot  ");
    
    }
    
    }
        public void retroceder(int pasos)
    {int contador=1;
   
    if (despierto )
    {    cpasos=cpasos+pasos;
           if (cpasos >=100)
           {   
               contador=cpasos;
//               contador=cpasos/100;
//               contador=contador*10;
//               cpasos= cpasos % 100;
                  if (contador <= bate.getCarga())
                  {recorrido=recorrido+pasos;
                   // aca no creo un metodo para modificar la bateria por que el ejercicio no pide tener ese metodo en la bateria 
                    
                      bate.setCarga(bate.getCarga()-contador);
                      System.out.println("El robot retrocedio con exito descontando: "+contador+" de energia su Bateria esta en : "+bate.getCarga()+" Su recorrido Total es : "+recorrido);
                     
                  }
           
                  else
                  {
                      System.out.println("no tiene carga suficiente, por favor cargue el robot ");
                  
                  }
           }
           else
           { // cpasos=cpasos+pasos;
               recorrido=recorrido+pasos;
                System.out.println("El robot retrocedio sin consumir energia , el recorrido caminado es : "+recorrido );
           
           }
    
    }
    else
    {
    
        System.out.println("El robot esta apagado , Por favor enciendo el robot  ");
    
    }
    
    }
        public void Dormir()
        {
        despierto=false;
            System.out.println("Robot Apagado");
        }
        
        public void Despertar()
        {
        despierto=true;
            System.out.println("Robot Encendido ");
        
        }
        public boolean bateriaLlena()
        {
         if (bate.getCarga()==1000)
         {
            return true;
         }
         return false;
        
        }
         public boolean bateriaVacia()
        {
         if (bate.getCarga()==0)
         {
            return false;
         }
         return true;
        
        }
         public int energiaActual()
         {
            return bate.getCarga();
         
         }
         public void recargar ()
         {
           bate.setCarga(1000);
             System.out.println("Recarga exitosa");
         
         
         }

    public boolean isDespierto() {
        return despierto;
    }
         

    public int getCpasos() {
        return cpasos;
    }

    public int getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }
    
 
}




////public class Robot {
////
////    private boolean despierto;
////
////    private Bateria bateria;
////    
////    private int distancia;
////    
////    private int pasosRestantes;
////
////    public Robot() {
////        bateria=new Bateria();
////        despierto=true;
////        distancia=0;
////        pasosRestantes=0;
////    }
////    
////    
////    public void avanzar(int pasos) {
////        
////        int descarga, unpaso=0;
////        pasosRestantes+=pasos;
////        distancia+=pasos;
////        for (int i = 0; i < pasos; i++) {
////            unpaso++;
////            if(!bateriaVacia())
////            {
////                if(pasos<1000)
////                {
////                    if(unpaso%100==0 && !bateriaVacia())
////                    {
////                        System.out.println("aqu");
////                        descarga=bateria.getCarga()-10;
////                        bateria.setCarga(descarga);
////                        
////                    }
////                    if(pasosRestantes%100==0 && pasosRestantes<1)
////                    {
////                      System.out.println("hola");
////                        descarga=bateria.getCarga()-10;
////                        bateria.setCarga(descarga);
////                        pasosRestantes=0;
////                    } 
////                }
////                else
////                {
////                    if(unpaso%100==0 && !bateriaVacia())
////                    {
////                        descarga=bateria.getCarga()-10;
////                        bateria.setCarga(descarga);
////                        
////                    }
////                }
////                
////            }
////            else
////            {
////                System.out.println("El robot se quedo sin batería");
////                distancia-=pasos-i;
////                pasosRestantes=pasos-i;
////                
////            }
////                   
////        }
////    }
////
////    public void retroceder(int pasos) {
////        
////        int descarga, unpaso=0;
////        pasosRestantes+=pasos;
////        distancia+=pasos;
////        for (int i = 0; i < pasos; i++) {
////            unpaso++;
////            if(!bateriaVacia())
////            {
////                if(pasos<1000)
////                {
////                    if(unpaso%100==0 && !bateriaVacia())
////                    {
////                        descarga=bateria.getCarga()-10;
////                        bateria.setCarga(descarga);
////                        System.out.println("bateria:"+bateria.getCarga());
////                        System.out.println("1Distancia: "+distancia);
////                        System.out.println("1Pasos restantes: "+pasosRestantes);
////                    }
////                    if(pasosRestantes%100==0 && pasosRestantes<1)
////                    {
////                      System.out.println("hola");
////                        descarga=bateria.getCarga()-10;
////                        bateria.setCarga(descarga);
////                        pasosRestantes=0;
////                    } 
////                }
////                else
////                {
////                    if(unpaso%100==0 && !bateriaVacia())
////                    {
////                        descarga=bateria.getCarga()-10;
////                        bateria.setCarga(descarga);
////                        System.out.println("bateria:"+bateria.getCarga());
////                        System.out.println("1Distancia: "+distancia);
////                        System.out.println("1Pasos restantes: "+pasosRestantes);
////                    }
////                }
////                
////            }
////            else
////            {
////                System.out.println("El robot se quedo sin batería");
////                distancia-=pasos-i;
////                pasosRestantes=pasos-i;
////                System.out.println("Distancia: "+distancia);
////                System.out.println("Pasos restantes:"+pasosRestantes);
////                System.out.println("bateria: "+bateria.getCarga());
////            }
////                   
////        }
////    }
////
////    public void dormir() {
////        despierto=false;
////    }
////    public void despertar(){
////        despierto=true;
////    }
////    
////    public boolean isDespierto(){
////        return despierto;
////    }
////
////    public void recargar() {
////        bateria.setCarga(1000);
////    }
////
////    public boolean bateriaLlena() {
////        return bateria.getCarga()==1000;
////    }
////
////    public boolean bateriaVacia() {
////        return bateria.getCarga()==0;
////    }
////
////    public int energiaActual() {
////        return bateria.getCarga();
////    }
////}
