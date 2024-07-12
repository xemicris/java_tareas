package tareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class estanqueGasolina {
    public static void main(String[] args) {
       double capacidadTanque = 70, capacidadActual = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la capacidad actual del tanque de gasolina 'en litros:'");
        try{
            capacidadActual = (Math.round(sc.nextDouble() * 100d)) / 100d;
            if(capacidadActual >= 1 && capacidadActual < 20) {
                System.out.println("Insuficiente");
            }else if(capacidadActual >= 20 && capacidadActual < 35){
                System.out.println("Suficiente");
            }else if(capacidadActual >= 35 && capacidadActual < 40) {
                System.out.println("Medio tanque");
            }else if(capacidadActual >= 40 && capacidadActual < 60) {
                System.out.println("Tanque a 3/4");
            }else if(capacidadActual >= 60 && capacidadActual < 70) {
                System.out.println("Tanque casi lleno");
            }else if(capacidadActual == 70) {
                System.out.println("Tanque lleno");
            }else{
                System.out.println("¡Se está saliendo la gasolina!");
            }

        }catch(InputMismatchException e){
            System.out.println("formato de capacidad no válido");
            main(args);
            System.exit(0);
        }

    }
}
