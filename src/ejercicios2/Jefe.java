package ejercicios2;


/**
 *
 * @author CFGS
 */

public class Jefe extends Trabajador{
    private int _numTrabajadores;
    
    public Jefe(int numTrabajadores,int numEmpleado, String nombre, int numDepart, int salario){
        super(numEmpleado,nombre,numDepart,salario);
        _numTrabajadores=numTrabajadores;
    }
    public int getNumTrabajadores(){
        return _numTrabajadores;
    }
    public void setNumTrabajadores(int numTrabajadores){
        _numTrabajadores=numTrabajadores;
    }
}
