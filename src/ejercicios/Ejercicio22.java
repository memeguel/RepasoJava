package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        String frase=JOptionPane.showInputDialog("Introduzca la frase:");
        int j=1, i, cont=0;
        for (i = 0; i < frase.length(); i++) {
            String letra=frase.substring(i, j);
            if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
                cont++;
            }
            j++;
        }
        JOptionPane.showMessageDialog(null, "La frase tiene "+cont+" vocales");
    } //Fin del main

} //Fin de la clase Ejercicio22
