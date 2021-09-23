package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el precio del producto:");
        double num=sc.nextFloat();
        final double iva=0.21;
        System.out.println("El precio final del producto es "+ (num+(num*iva)));
    } //Fin del main

} //Fin de la clase Ejercicio9
