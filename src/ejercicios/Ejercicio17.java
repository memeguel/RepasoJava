package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca el día de la semana: ");
        String dia=sc.nextLine();
        if (dia.equalsIgnoreCase("lunes")||dia.equalsIgnoreCase("martes")||dia.equalsIgnoreCase("miercoles")||dia.equalsIgnoreCase("jueves")||dia.equalsIgnoreCase("viernes")) {
            System.out.println("El día es laborable");
        }
        else if (dia.equalsIgnoreCase("sabado")||dia.equalsIgnoreCase("domingo")) {
            System.out.println("El día no es laborable");
        }
        else{
            System.out.println("El valor introducido no es un día de la semana");
        }
       
        
    } //Fin del main

} //Fin de la clase Ejercicio17
