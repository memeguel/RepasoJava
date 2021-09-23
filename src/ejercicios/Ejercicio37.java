package ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio37 {
    public static void main(String[] args) {
        String numero="";
        int cont=0;
        ArrayList<Integer> arrayListNumeros=new ArrayList<>();
        numero=JOptionPane.showInputDialog("Introduzca un numero:");
        while(!numero.equals("-1")){
            arrayListNumeros.add(Integer.parseInt(numero));
            numero=JOptionPane.showInputDialog("Introduzca un numero:");
        }
        
        
        if (arrayListNumeros.size()>1) {
            int num1=arrayListNumeros.get(cont);
            for (cont = 1; cont < arrayListNumeros.size(); cont++) {
                num1=Integer.max(num1, arrayListNumeros.get(cont));
            }
            System.out.println("El numero mas grande es: "+num1);
            num1=arrayListNumeros.get(0);
            for (cont = 1; cont < arrayListNumeros.size(); cont++) {
                num1=Integer.min(num1, arrayListNumeros.get(cont));
            }
            System.out.println("El numero mas pequeño es: "+num1);
            num1=arrayListNumeros.get(0);
            for (cont = 1; cont < arrayListNumeros.size(); cont++) {
                num1=Integer.sum(num1, arrayListNumeros.get(cont));
            }
            System.out.println("Suma de todos los numeros: "+num1);

        }
        /*Vehiculos vehiculo1=arrayListNumeros.get(0);
        int precio=vehiculo1.getPrecio();
        for (int i = 1; i < arrayListNumeros.size(); i++) {
            vehiculo1=arrayListNumeros.get(i);
            precio=Double.max(precio, vehiculo1.getPrecio());
        }*/
        
        //JOptionPane.showMessageDialog(null, "La cantidad de numeros introducidos es: ");
    } //Fin del main

} //Fin de la clase Ejercicio37
