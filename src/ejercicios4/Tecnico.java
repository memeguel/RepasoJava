package ejercicios4;


/**
 *
 * @author CFGS
 */

public class Tecnico extends Trabajador{
    private Jefe trabajaPara;
    public Tecnico(Jefe trabajaPara, String nombre, String empresa){
        super(nombre, empresa);
        this.trabajaPara=trabajaPara;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"Soy un TECNICO y trabajo para "+getTrabajaPara().getNombre();
    }

    public Jefe getTrabajaPara() {
        return trabajaPara;
    }

    public void setTrabajaPara(Jefe trabajaPara) {
        this.trabajaPara = trabajaPara;
    }
    
}
