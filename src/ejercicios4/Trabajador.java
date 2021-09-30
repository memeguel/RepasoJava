package ejercicios4;


/**
 *
 * @author CFGS
 */

public class Trabajador extends Persona{
    private String empresa;
    
    public Trabajador(String empresa){
        this.empresa=empresa;
    }
    public Trabajador(String nombre,String empresa){
        super(nombre);
        this.empresa=empresa;
    }
    public String toString(){
        return super.toString()+"\n"+"Empresa= "+empresa;
    } 
    
}
