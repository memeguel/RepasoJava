package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVentas=0;
        double total=0;
        String precio="";
        for (int j = 0; j <= numVentas; numVentas++) {
            System.out.print("Introduzca el precio de la venta:");
            precio=sc.nextLine();
            if (precio.equalsIgnoreCase("*")) {
                break;
            }
            total += Double.parseDouble(precio);
        }
        if (numVentas!=0) {
            
            System.out.println("Nº de ventas: "+numVentas);
        }
        else{
            System.out.println("No hay nº de ventas: "+numVentas);
        }
        System.out.println("El precio total es: "+total+"€");
    } //Fin del main

} //Fin de la clase Ejercicio15
