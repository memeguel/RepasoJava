package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de ventas realizadas los ultimos 15 días:");
        int numVentas = sc.nextInt();
        double total=0;
        for (int j = 0; j < numVentas; j++) {
            System.out.print("Introduzca el precio de la venta:");
            total += sc.nextDouble();
        }
        System.out.println("El precio total es: "+total);
            
    } //Fin del main

} //Fin de la clase Ejercicio13
