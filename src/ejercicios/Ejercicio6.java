package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio del circulo:");
        double radio = sc.nextInt();
        double area = Math.PI*(Math.pow(radio, 2));
        System.out.println(area);
        
        sc.close();
    } //Fin del main

} //Fin de la clase Ejercicio6
