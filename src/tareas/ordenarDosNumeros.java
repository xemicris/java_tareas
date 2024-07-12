package tareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ordenarDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0, numero2 = 0, numeroMayor = 0, numeroMenor = 0;
        try{
            System.out.println("Introduce el primer número");
            numero1 = sc.nextInt();
            System.out.println("Introduce el segundo número");
            numero2 = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("el número introducido no es válido");
            main(args);
            System.exit(0);
        }
        numeroMayor = Math.max(numero1, numero2);
        numeroMenor = (numeroMayor == numero1) ? numero2: numero1;
        System.out.println(numeroMayor);
        System.out.println(numeroMenor);

    }
}
