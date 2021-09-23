package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

enum DIAS {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};
public class Ejercicio17v2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduzca el día de la semana: ");
        String dia=sc.next().toLowerCase();
        switch(dia){
            case "lunes":
                System.out.println("Día laborable");
                break;
            case "martes":
                System.out.println("Día laborable");
                break;
            case "miercoles":
                System.out.println("Día laborable");
                break;
            case "jueves":
                System.out.println("Día laborable");
                break;
            case "viernes":
                System.out.println("Día laborable");
                break;
            case "sabado":
                System.out.println("Día no laborable");
                break;
            case "domingo":
                System.out.println("Día no laborable");
                break;
            default:
                System.out.println("Valor no válido");
             
        }
    } //Fin del main

} //Fin de la clase Ejercicio17v2
