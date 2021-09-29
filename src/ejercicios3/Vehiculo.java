package ejercicios3;

import java.util.Scanner;


/**
 *
 * @author CFGS
 */
enum Colores{ROJO,AZUL,VERDE};
public class Vehiculo {
    private Colores color;
    private int numSerie;
    
    public Vehiculo(Colores color,int numSerie){
        this.color=color;
        this.numSerie=numSerie;
    }
    public Colores getColor(){
        return color;
    }
    public void setColor(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el color ");
        String colorT=sc.nextLine().toLowerCase();
        Colores color=null;
        switch(colorT){
            case "rojo":
                color=Colores.ROJO;
                break;
            case "azul":
                color=Colores.AZUL;
                break;
            case "verde":
                color=Colores.VERDE;
                break;
            
        }
    }
    public int getNumSerie(){
        return numSerie;
    }
    
    public String toString(){
        return "color="+color.name()+", numSerie="+numSerie;
    }
    
}
