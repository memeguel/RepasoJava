package ejercicios4;


/**
 *
 * @author CFGS
 */

public class Jefe extends Trabajador{
    private int numEmpleados;
    
    public Jefe(int numEmpleados, String nombre, String empresa){
        super(nombre, empresa);
        this.numEmpleados=numEmpleados;
    }
    public String getNombre(){
        return super.nombre;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"Soy un JEFE y tengo "+numEmpleados+" empleados";
    }
}
