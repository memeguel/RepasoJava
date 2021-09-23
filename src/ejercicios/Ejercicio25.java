package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        String numero="1";
        while(numero.equals("1")){
            numero=JOptionPane.showInputDialog("Introduzca un numero mayor que 1:");
        }
        int num=Integer.parseInt(numero);
        int resul=0;
        for (int i = 0; i <= num; i++) {
            resul+=i;
        }
        JOptionPane.showMessageDialog(null, "El reslutado de sumar todos los numeros entre 1 y "+num+" es: "+resul);
    } //Fin del main

} //Fin de la clase Ejercicio25
