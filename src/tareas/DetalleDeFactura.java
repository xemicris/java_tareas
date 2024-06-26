package tareas;
    /*Utiliza la clase Scanner:

        a) Recibe el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura
            con espacios.
        b) Recibe 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales
        c) Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
        d)Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto
         y el monto total neto incluyendo impuesto. Ejemplo:

         La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de
         impuesto es de 160.3882*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        //Definición de variables
        Scanner scanner = new Scanner(System.in);
        String nombreFactura;
        double precio1 = 0;
        double precio2 = 0;
        double impuesto = 19e-2;
        double totalAntesImpuesto;
        double total;
        try{
            //datos de entrada
            System.out.println("Ingresa el nombre de la factura");
            nombreFactura = scanner.nextLine();
            System.out.println("Introduce el primer precio");
            precio1 = scanner.nextDouble();
            System.out.println("Introduce el segundo precio");
            precio2 = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("tipo de dato introducido no válido");
            main(args);
            System.exit(0);
        }
        totalAntesImpuesto = precio1 + precio2;
        impuesto = totalAntesImpuesto * impuesto;
        total = totalAntesImpuesto + impuesto;
        System.out.println("La factura producto de oficina tiene un total bruto de " + totalAntesImpuesto + ", con un impuesto de " +
                            impuesto + ",y el monto después de impuesto es de " + total);
        
    }
}
