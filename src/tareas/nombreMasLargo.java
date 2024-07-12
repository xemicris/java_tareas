package tareas;

import javax.swing.*;

public class nombreMasLargo {
    public static void main(String[] args) {
        String nombreCompleto1 = JOptionPane.showInputDialog("Introduce el primer nombre completo");
        String nombreCompleto2 = JOptionPane.showInputDialog("Introduce el segundo nombre completo");
        String nombreCompleto3 = JOptionPane.showInputDialog("Introduce el tercer nombre completo");

        //validar
        comprobarDato(nombreCompleto1, "primer", args);
        comprobarDato(nombreCompleto2, "segundo", args);
        comprobarDato(nombreCompleto3, "tercero", args);

        comprobarNumero(nombreCompleto1, "primer", args);
        comprobarNumero(nombreCompleto2, "segundo", args);
        comprobarNumero(nombreCompleto3, "tercero", args);


        String[] nombre1 = nombreCompleto1.split(" ");
        String[] nombre2 = nombreCompleto2.split(" ");
        String[] nombre3 = nombreCompleto3.split(" ");
        String nombreMasLargo =
                (nombre1[0].length() > nombre2[0].length())
                        ? (nombre1[0].length() > nombre3[0].length()) ? nombre1[0] : nombre3[0]
                        : (nombre2[0].length() > nombre3[0].length()) ? nombre2[0] : nombre3[0];
        JOptionPane.showMessageDialog(null, "El nombre más largo es " + nombreMasLargo);
    }

    private static void comprobarNumero(String nombre, String numero, String[] args){

        try {
            int numeroEntero = Integer.parseInt(nombre);
            double numeroReal = Double.parseDouble(nombre);
            JOptionPane.showMessageDialog(null,"El " + numero + " nombre introducido no es correcto. Repite por favor");
            main(args);
            System.exit(0);

        }catch(Exception ignored){
        }
    }

    private static void comprobarDato(String nombre, String numero, String[] args){
        if(nombre.length() <= 0){
            JOptionPane.showMessageDialog(null,"No has introducido el " + numero + " nombre. Repite por favor");
            main(args);
            System.exit(0);
        }
    }
}


