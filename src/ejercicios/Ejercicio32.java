package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio32 {
    public static void main(String[] args) {
        String frase=JOptionPane.showInputDialog("Introduzca una frase:");
        JOptionPane.showMessageDialog(null, "La cuarta y quinta letra son ("+frase.substring(3, 5)+")");   
    } //Fin del main

} //Fin de la clase Ejercicio32
