package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio31 {
    public static void main(String[] args) {
        String palabra1=JOptionPane.showInputDialog("Introduzca una palabra:");
        String palabra2=JOptionPane.showInputDialog("Introduzca otra palabra:");
        if (palabra1.equals(palabra2)) {
            JOptionPane.showMessageDialog(null, "Las palabras son iguales");    
            } 
        else {
            JOptionPane.showMessageDialog(null, "Las palabras no son iguales");    
            }
    } //Fin del main

} //Fin de la clase Ejercicio31
