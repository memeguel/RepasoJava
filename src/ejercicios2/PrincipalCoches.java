package ejercicios2;

import java.util.Scanner;



/**
 *
 * @author CFGS
 */

public class PrincipalCoches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca el numero de coches:");
        int numCoches=sc.nextInt();
        Coches[] arrayCoches=new Coches[numCoches];
        for (int i = 0; i < numCoches; i++) {
            sc.nextLine();
            System.out.println("\nDatos del coche nº"+(i+1)+":");
            System.out.print("Introduzca la marca:");
            String marca=sc.nextLine();
            System.out.print("Introduzca la modelo:");
            String modelo=sc.nextLine();
            System.out.print("Introduzca la potencia:");
            int potencia=sc.nextInt();
            System.out.print("Introduzca la precio:");
            double precio=sc.nextDouble();
            Coches e=new Coches(marca, modelo, potencia, precio);
            arrayCoches[i]=e;
        }
        int indice=getIndiceCocheMasBarato(arrayCoches);
        Coches coche1=arrayCoches[indice];
        System.out.println("\nEl coche de menor precio es:");
        System.out.printf("%s %s %n%s %s %n%s %d %n%s %.2f€%n", "Marca:",coche1.getMarca(),"Modelo:",coche1.getModelo(),"Potencia:",coche1.getPotencia(),"Precio:",coche1.getPrecio());
    } //Fin del main
    static int getIndiceCocheMasBarato(Coches[] arrayCoches){
        int indice=0;
        Coches coche1=arrayCoches[indice];
        double precio=coche1.getPrecio();
        for (int i = 1; i < arrayCoches.length; i++) {
            coche1=arrayCoches[i];
            if (coche1.getPrecio()<precio) {
                precio=coche1.getPrecio();
                indice=i;
            }
        }
        return indice;
    }
} //Fin de la clase PrincipalCoches
