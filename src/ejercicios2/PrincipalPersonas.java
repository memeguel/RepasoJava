package ejercicios2;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class PrincipalPersonas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Personas[] arrayPersonas=new Personas[3];
        for (int i = 0; i < 3; i++) {
            
            System.out.println("\nDatos de la persona nº"+(i+1)+":");
            System.out.print("Introduzca el nombre:");
            String nombre=sc.nextLine();
            System.out.print("Introduzca el primer apellido:");
            String apellido1=sc.nextLine();
            System.out.print("Introduzca el segundo apellido:");
            String apellido2=sc.nextLine();
            System.out.print("Introduzca la edad:");
            int edad=sc.nextInt();
            Personas e=new Personas(nombre, apellido1, apellido2, edad);
            arrayPersonas[i]=e;
            sc.nextLine();
        }
        for (int i = 0; i < 3; i++) {
             Personas e=arrayPersonas[i];
            System.out.printf("%s %s %s tiene %d años%n",e.getNombre(),e.getApellido1(),e.getApellido2(),e.getEdad());
        }
    } //Fin del main

} //Fin de la clase PrincipalPersonas
