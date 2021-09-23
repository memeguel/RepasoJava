package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        String fakeNum=JOptionPane.showInputDialog("Introduzca un número:");
        int num=Integer.parseInt(fakeNum), i;
        for (i = 0; num>=1; i++) {
            num=num/10;
        }
        JOptionPane.showMessageDialog(null, "Cantidad de espacios que ocupa el número "+fakeNum+" es: "+i);
    } //Fin del main

} //Fin de la clase Ejercicio19
