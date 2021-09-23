package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio33 {
    public static void main(String[] args) {
        String frase=JOptionPane.showInputDialog("Introduzca una frase:");
        String[] palabras=frase.split(" ");
        int cont=0;
        frase="";
        while (cont!=palabras.length) {            
            frase+=cont+palabras[cont]+"\n";
            cont++;
        }
        JOptionPane.showMessageDialog(null, frase);
    } //Fin del main

} //Fin de la clase Ejercicio33
