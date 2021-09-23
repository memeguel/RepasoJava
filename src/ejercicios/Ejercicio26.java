package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio26 {
    public static void main(String[] args) {
       String numero="";
       int cont=0;
       numero=JOptionPane.showInputDialog("Introduzca un numero:");
        while(!numero.equals("-1")){
            cont++;
            numero=JOptionPane.showInputDialog("Introduzca un numero:"); 
        }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros introducidos es: "+cont);
    } //Fin del main

} //Fin de la clase Ejercicio26
