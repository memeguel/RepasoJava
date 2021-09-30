package ejercicios3;


/**
 *
 * @author CFGS
 */

public class Coche extends Vehiculo{
    private int cilindrada;
    
    public Coche(Colores color,int numSerie,int cilindrada){
        super(color,numSerie);
        this.cilindrada=cilindrada;
    }
    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada=cilindrada;
    }
    public String toString(){
        return "Vehículo -> numSerie= "+getNumSerie()+", color= "+getColor().name()+", es un COCHE con cilindrada= "+cilindrada;
    }
    
}
