package ejercicios2;


/**
 *
 * @author CFGS
 */

public class Trabajador {
    private int _numEmpleado;
    private String _nombre;
    private int _numDepart;
    private int _salario;
    
    public Trabajador(){
        
    }
    public Trabajador(int numEmpleado,String nombre,int numDepart,int salario){
        _numEmpleado=numEmpleado;
        _nombre=nombre;
        _numDepart=numDepart;
        _salario=salario;
    }
    public int getNumEmpleado(){
        return _numEmpleado;
    }
    public String getNombre(){
        return _nombre;
    }
    public int getNumDepart(){
        return _numDepart;
    }
    public int getSalario(){
        return _salario;
    }
    public void setNumEmpleado(int numEmpleado){
        _numEmpleado=numEmpleado;
    }
    public void setNombre(String nombre){
        _nombre=nombre;
    }
    public void setNumDepart(int numDepart){
        _numDepart=numDepart;
    }
    public void setSalario(int salario){
        _salario=salario;
    }
}
