package ejercicios2;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class PrincipalCuenta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cuenta[] arrayCuentas=new Cuenta[2];
        for (int i = 0; i < arrayCuentas.length; i++) {
            System.out.println("\nDatos de la cuenta nº"+(i+1)+":");
            System.out.print("Introduzca el nº de cuenta:");
            int numCuenta=sc.nextInt();
            System.out.print("Introduzca el saldo:");
            double saldo=sc.nextDouble();
            Cuenta e=new Cuenta(numCuenta,saldo);
            arrayCuentas[i]=e;
            sc.nextLine();
        }
        Cliente cliente1=new Cliente("Miguel","Martín","Szelest",arrayCuentas);
        cliente1.getSaldoCuenta();
        cliente1.ingresarDinero();
        cliente1.retirarDinero();
        cliente1.getSaldoCuenta();

    } //Fin del main

} //Fin de la clase PrincipalCuenta
