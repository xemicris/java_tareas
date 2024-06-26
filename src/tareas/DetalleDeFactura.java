package tareas;

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
