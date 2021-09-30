package ejercicios4;


/**
 *
 * @author CFGS
 */

public class Comercial extends Trabajador{
    private double bonus;
    public Comercial(double bonus, String nombre, String empresa){
        super(nombre, empresa);
        this.bonus=bonus;
    }
    public String toString(){
        return super.toString()+"\n"+"Soy un COMERCIAL y tengo un bonus de "+bonus;
    }
    
}
