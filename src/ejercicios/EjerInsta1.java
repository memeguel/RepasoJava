package ejercicios;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class EjerInsta1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros que quiere que aparezcan:");
        int count=sc.nextInt();
        int n1=0, n2=1, n3, i;
        
        System.out.print(n1+" "+n2);
        for (i = 2; i < count; i++) {
           n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    } //Fin del main

} //Fin de la clase EjerInsta1
