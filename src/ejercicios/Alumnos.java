/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author CFGS
 */
public class Alumnos {
    private static int cont=0;
    private int ID;
    private String nombre;
    private String apellido;
    private double nota;

    public Alumnos(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        setID();
        nota=Math.random()*10;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getNombre() {
        return nombre;
    }
    public int getID() {
        return ID;
    }
    public double getNota() {
        return nota;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    private void setID(){
        cont++;
        ID=cont;
    }
    
}
