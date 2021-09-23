package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        double num1=sc.nextDouble();
        System.out.println("Introduzca el segundo número: ");
        double num2=sc.nextDouble();
        double resul=0;
        for (int i = 0; i < 50; i++) {
            if (num1>num2) {
                resul=(Math.random()*(num1-num2))+num2;
                resul=Math.round(resul);
            }
            else if (num1<num2) {
                resul=(Math.random()*(num2-num1))+num1;
                resul=Math.round(resul);
            }
            else{
                System.out.println("No se puede hacer");
                break;
            }
            System.out.println(resul);
        }
    } //Fin del main

} //Fin de la clase Ejercicio18
