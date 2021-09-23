package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero a comprobar: ");
        int num=sc.nextInt();
        int i;
        for (i = num/2; i < num&&i>1; i--) {
            if (num%i==0) {
                System.out.println("Este número no es primo");
                break;
            }
        }
        if (i==1) {
            System.out.println("El número es primo");
        }
    } //Fin del main

} //Fin de la clase Ejercicio20
