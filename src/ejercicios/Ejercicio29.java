package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio29 {
    public static void main(String[] args) {
        Object[] opciones={"MAYÚSCULAS","minúsculas"};
        String frase= JOptionPane.showInputDialog(null, "Introduzca la frase:", "Pregunta", JOptionPane.QUESTION_MESSAGE);
        int opcion=JOptionPane.showOptionDialog(null, "Eliga una: ", "Tipo de letra",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, opciones, opciones[0]);
        if (opcion==0) {
            frase=frase.toUpperCase();
        }
        else{
            frase=frase.toLowerCase();
        }
        JOptionPane.showMessageDialog(null, frase, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    } //Fin del main

} //Fin de la clase Ejercicio29
