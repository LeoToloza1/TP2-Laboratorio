
import java.util.Scanner;

public class Hombre {

    public Hombre() {
    }

    public void jugarConRobot(Robot r) {
        
//        System.out.println("A continuación el robot avanzará 280 pasos");
//            r.avanzar(280);
//            System.out.println("Energía actual del robot: "+r.energiaActual());
//        System.out.println("A continuación el robot avanza 20 pasos");
            r.avanzar(1000000);
            r.avanzar(2);
//        System.out.println("A continuación avanza 80 pasos");
//            r.retroceder(10000);
        System.out.println("Energía actual del robot: "+r.energiaActual()); 
//        r.dormir();
            
          
//          boolean salir=false;
//        while(r.)
//        {
//           Scanner sc= new Scanner(System.in);
//           int op=0, pasos;
//           r.despertar();
//
//           if(r.bateriaVacia())
//               r.recargar();
//            System.out.println("Ingrese cantidad de pasos");
//            pasos=sc.nextInt();
//
//            System.out.println("Presione 1 para hacer que avance, 2 para hacer que retroceda");
//            op=sc.nextInt();
//            if(op!=1 && op!=2)
//            {
//                while(op!=1 && op!=2)
//                {
//                  System.out.println("Error, ingrese nuevamente:");
//                  op=sc.nextInt();
//                }
//            }
//            if(op==1)
//                r.avanzar(pasos);
//            else
//                r.retroceder(pasos);
//            System.out.println("Energía actual: "+r.energiaActual());
//            System.out.println(" Presione 1 para poner a dormir el robot");
//            op=sc.nextInt();
//
//            if(op==1)
//                salir=true;
//        }
    }
    
    
   
        
}
