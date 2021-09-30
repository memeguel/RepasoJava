package ejercicios3;


/**
 *
 * @author CFGS
 */

public class Barco extends Vehiculo{
    
    public Barco(Colores color,int numSerie){
        super(color,numSerie);
    }
    public String toString(){
        return "Vehículo -> numSerie= "+getNumSerie()+", color= "+getColor().name()+" y es un BARCO";
    }
}
