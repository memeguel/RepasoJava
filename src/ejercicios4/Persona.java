package ejercicios4;


/**
 *
 * @author CFGS
 */

public class Persona {
    protected String nombre;
    public Persona(){
    
    }
    public Persona(String nombre){
    this.nombre=nombre;
    }
    public String toString(){
        return "Nombre= "+ nombre;
    } 
}
