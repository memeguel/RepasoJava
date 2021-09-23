package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        String numerosFake;
        numerosFake=JOptionPane.showInputDialog("Introduzca un numero:");
        int num1=Integer.parseInt(numerosFake);
        numerosFake=JOptionPane.showInputDialog("Introduzca otro numero:");
        int num2=Integer.parseInt(numerosFake);
        if (num1>num2) {
            for (int i = num2; i <= num1; i++) {
                int j;
                for (j = i/2; j>1; j--) {
                    if (i%j==0) {
                        break;
                    }
                }
                if (j==1) {
                    System.out.print(i+" ");
                }
            }
        }
        else if (num1<num2) {
            for (int i = num1; i <= num2; i++) {
                int j;
                for (j = i/2; j>1; j--) {
                    if (i%j==0) {
                        j=0;
                    }
                }
                if (j==1) {
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("Los numeros son iguales"); 
        }     
    } //Fin del main

} //Fin de la clase Ejercicio21
