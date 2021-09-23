package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        String frase=JOptionPane.showInputDialog("Introduzca la frase:");
        JOptionPane.showMessageDialog(null, "Frase original: "+frase+"\n"+"Frase modificada: "+frase.replace("a", "e"));
    } //Fin del main

} //Fin de la clase Ejercicio23
