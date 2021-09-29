package ejercicios2;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */

public class Cliente {
    private String nombre;
    private String apellido;
    private String NIF;
    private Cuenta[] arrayCuentas;

    public Cliente(){
        
    }
    public Cliente(String nombre, String apellido, String NIF,Cuenta[] arrayCuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
        this.arrayCuentas=arrayCuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    public void getSaldoCuenta(){
        for (int i = 0; i < arrayCuentas.length; i++) {
            Cuenta e=arrayCuentas[i];
            System.out.println("El saldo de la cuenta nº"+(i+1)+" es "+e.getSaldo()+"€");
        }
    }
    public void ingresarDinero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nº de cuenta:");
        int numCuenta=sc.nextInt();
        for (int i = 0; i < arrayCuentas.length; i++) {
            Cuenta e=arrayCuentas[i];
            if (numCuenta==e.getNumCuenta()) {
                System.out.println("Introduzca la cantidad a ingresar:");
                double saldo=sc.nextDouble();
                e.setSaldo(e.getSaldo()+saldo);
            }
        }
    }
    public void retirarDinero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nº de cuenta:");
        int numCuenta=sc.nextInt();
        for (int i = 0; i < arrayCuentas.length; i++) {
            Cuenta e=arrayCuentas[i];
            if (numCuenta==e.getNumCuenta()) {
                System.out.println("Introduzca la cantidad a retirar:");
                double saldo=sc.nextDouble();
                e.setSaldo(e.getSaldo()-saldo);
            }
        }
    }
    
}
