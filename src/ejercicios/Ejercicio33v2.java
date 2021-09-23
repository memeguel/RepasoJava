package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio33v2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca una frase:");
        String frase=sc.nextLine();
        String[] palabras=frase.split(" ");
        int cont=0;
        frase="";
        while (cont!=palabras.length) {            
            frase+=cont+" "+palabras[cont]+"\n";
            cont++;
        }
        System.out.println(frase);
    } //Fin del main

} //Fin de la clase Ejercicio33
