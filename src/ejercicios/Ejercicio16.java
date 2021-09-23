package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password="ovejita123";
        String prueba="";
        int i=3;
        while (i > 0) {
            System.out.print("Introduzca la contraseña: ");
            prueba=sc.nextLine();
            if (prueba.equals(password)) {
                System.out.println("¡Enhorabuena!");
                break;
            }
            i--;
            System.out.println("Te quedan "+i+" intentos.");
            if (i==0) {
                System.out.println("Has agotado tus 3 intentos. No has acertado");
            }
        }
    } //Fin del main
} //Fin de la clase Ejercicio16
