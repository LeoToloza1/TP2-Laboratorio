package Tpo2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Combustible nafta = new Combustible("nafta", 257.0f);
        Combustible gasoil = new Combustible("Gasoil", 310.0f);
        Vehiculo auto = new Auto("Ford", "XYZ123", nafta);
        Vehiculo camioneta = new Camioneta("Chevrolet", "ABC456", nafta);
        Vehiculo camion = new Camion("Mercedes Benz", "CPP159", gasoil);
        Ciudad origen = new Ciudad("Merlo", 148, 0);
        Ciudad destino = new Ciudad("Carlo Paz", 34, 209.8);
        Viaje viaje; //= new Viaje(origen, destino, 209.8, 2, Vehiculo);
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt(); //1 para auto // 2para camioneta // 3 para camion
        System.out.println("CALCULO DE UN VIAJE\ncon Origen:\nMerlo \ny destino: \n**Villa Carlos Paz**");
         System.out.println("");
        switch (opcion) {
            case 1:
                viaje = new Viaje(origen, destino, 209.8, 2, auto);
                System.out.println("Calculando la distancia entre el origen y el destino: " + viaje.calculoDeDistancia() + "Km");
                System.out.println("El costo de los peajes es: $" + viaje.calculoPeaje());
                System.out.println("El costo del combustible que vamos a necesitar es: $" + viaje.calculoCostoCombustible());
                System.out.println("Con lo cual obtenemos el costo total del viaje que sera de: $" + viaje.costoTotal());
                System.out.println("ESTE VIAJE SE REALIZARA CON EL SIGUIENTE VEHICULO:");
                System.out.println(auto);
                break;

            case 2:
                viaje = new Viaje(origen, destino, 209.8, 2, camioneta);
                System.out.println("Calculando la distancia entre el origen y el destino: " + viaje.calculoDeDistancia() + "Km");
                System.out.println("El costo de los peajes es: $" + viaje.calculoPeaje());
                System.out.println("El costo del combustible que vamos a necesitar es: $" + viaje.calculoCostoCombustible());
                System.out.println("Con lo cual obtenemos el costo total del viaje que sera de: $" + viaje.costoTotal());
                System.out.println("ESTE VIAJE SE REALIZARA CON EL SIGUIENTE VEHICULO:");
                System.out.println(camioneta);
                break;

            case 3:
                viaje = new Viaje(origen, destino, 209.8, 2, camion);
                System.out.println("Calculando la distancia entre el origen y el destino: " + viaje.calculoDeDistancia() + "Km");

                System.out.println("El costo de los peajes es: $" + viaje.calculoPeaje());
                System.out.println("El costo del combustible que vamos a necesitar es: $" + viaje.calculoCostoCombustible());
                System.out.println("Con lo cual obtenemos el costo total del viaje que sera de: $" + viaje.costoTotal());
                System.out.println("ESTE VIAJE SE REALIZARA CON EL SIGUIENTE VEHICULO:");
                System.out.println(camion);
                break;
        }
    }
}
    
