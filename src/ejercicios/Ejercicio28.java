package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio28 {
    public static void main(String[] args) {
        String frase="", resul="";
        
        while (true) {            
            frase=JOptionPane.showInputDialog("Introduzca una frase:");
            resul+=frase+"\n"; 
            if (frase.equals("")||frase.equals(" ")) {
                break;
            }
        }
        System.out.println(resul);
    } //Fin del main

} //Fin de la clase Ejercicio28
