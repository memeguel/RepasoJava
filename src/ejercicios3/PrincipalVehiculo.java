package ejercicios3;


/**
 *
 * @author CFGS
 */

public class PrincipalVehiculo {
    public static void main(String[] args) {
        Coche coche1=new Coche(Colores.ROJO,1,250);
        Barco barco1=new Barco(Colores.VERDE,1);
        
        System.out.println(coche1.toString());
        System.out.println(barco1.toString());
    } //Fin del main

} //Fin de la clase PrincipalVehiculo
