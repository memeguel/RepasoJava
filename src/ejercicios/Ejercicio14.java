package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Introduzca el primer número:");
        num1= sc.nextInt();
        System.out.print("Introduzca el segundo número:");
        num2= sc.nextInt();
        System.out.print("Introduzca el tercer número:");
        num3= sc.nextInt();
        
        double diferencial=Math.pow(num2, 2)-(4*num1*num3);
        double resul=0;
        if (resul>0) {
            resul=(-num2+Math.sqrt(diferencial))/(2*num1);
            System.out.println("La primera solución es: "+resul);
            resul=(-num2-Math.sqrt(diferencial))/(2*num1);
            System.out.println("La segunda solución es: "+resul);
        }
        else if (resul==0) {
            resul=(-num2+Math.sqrt(diferencial))/(2*num1);
            System.out.println("La solución es: "+resul);
        }
        else{
            System.out.println("No hay solución");
        }
    } //Fin del main

} //Fin de la clase Ejercicio14
