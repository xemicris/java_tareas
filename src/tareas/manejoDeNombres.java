package tareas;

import java.util.Scanner;

public class manejoDeNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("Introduce el primer nombre");
        String primerNombreIntroducido = sc.nextLine();

        System.out.println("Introduce el segundo nombre");
        String segundoNombreIntroducido = sc.nextLine();

        System.out.println("Introduce el tercer nombre");
        String tercerNombreIntroducido = sc.nextLine();

        //Validaciones
        comprobarLongitud(primerNombreIntroducido, "primer", args);
        comprobarLongitud(segundoNombreIntroducido, "segundo", args);
        comprobarLongitud(tercerNombreIntroducido, "tercer", args);
        comprobarNumero(primerNombreIntroducido, args);
        comprobarNumero(segundoNombreIntroducido, args);
        comprobarNumero(tercerNombreIntroducido, args);

        //Procesamiento
        String primerNombre = procesarNombre(primerNombreIntroducido);
        String segundoNombre = procesarNombre(segundoNombreIntroducido);
        String tercerNombre = procesarNombre(tercerNombreIntroducido);
        String resultado = primerNombre + ("_") + segundoNombre + ("_") + tercerNombre;
        System.out.println("El resultado es: " + resultado);
    }

    private static String procesarNombre(String nombreInicial) {
        StringBuilder sb = new StringBuilder(nombreInicial);
        return sb.substring(1, 2).toUpperCase().concat(".").concat(sb.substring(sb.length()-2));

    }
    private static void comprobarLongitud(String nombre, String posicion, String[] args) {
        if (nombre.length() < 2) {
            System.out.println("El " + posicion + " nombre debe contener al menos dos carácteres");
            main(args);
            System.exit(0);

        }
    }

    private static void comprobarNumero(String nombre, String[] args){

        try {
            int numeroEntero = Integer.parseInt(nombre);
            double numeroReal = Double.parseDouble(nombre);
            System.out.println("No se permiten números");
            main(args);
            System.exit(0);

        }catch(Exception ignored){
        }

    }
}
