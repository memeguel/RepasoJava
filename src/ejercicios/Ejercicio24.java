package ejercicios;

import javax.swing.JOptionPane;


/**
 *
 * @author CFGS
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        String numeros=JOptionPane.showInputDialog("Introduzca el primer número:");
        double num1=Double.parseDouble(numeros);
        numeros=JOptionPane.showInputDialog("Introduzca el segundo número:");
        double num2=Double.parseDouble(numeros);
        numeros=JOptionPane.showInputDialog("Introduzca el signo:");
        switch(numeros){
            case "+":
                JOptionPane.showMessageDialog(null, "El reslutado es: "+(num1+num2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, "El reslutado es: "+(num1-num2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, "El reslutado es: "+(num1*num2));
                break;
            case "/":
                JOptionPane.showMessageDialog(null, "El reslutado es: "+(num1/num2));
                break;
            case "^":
                JOptionPane.showMessageDialog(null, "El reslutado es: "+(Math.pow(num1, num2)));
                break;
            case "%":
                JOptionPane.showMessageDialog(null, "El reslutado es: "+(num1%num2));
                break;
        }
    } //Fin del main

} //Fin de la clase Ejercicio24
