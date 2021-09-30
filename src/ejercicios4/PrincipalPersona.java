package ejercicios4;


/**
 *
 * @author CFGS
 */

public class PrincipalPersona {
    public static void main(String[] args) {
        Persona[] arrayPersonas=new Persona[10];
        
        Jefe jefe1=new Jefe(1,"Jefe 1","Acme");
        Jefe jefe2=new Jefe(2,"Jefe 2","Acme");
        Jefe jefe3=new Jefe(3,"Jefe 3","Acme");
        Jefe jefe4=new Jefe(4,"Jefe 4","Acme");
        Jefe jefe5=new Jefe(5,"Jefe 5","Acme");
        Jefe jefe6=new Jefe(2,"Jefe 6","Acme");
        
        Comercial comercial1=new Comercial(100,"Comercial 1","Acme");
        Comercial comercial2=new Comercial(500,"Comercial 2","Acme");
        Comercial comercial3=new Comercial(333.33,"Comercial 3","Acme");
        
        Tecnico tecnico1=new Tecnico(jefe1,"Tecnico 1","Acme");
        
        arrayPersonas[0]=jefe1;
        arrayPersonas[1]=jefe2;
        arrayPersonas[2]=jefe3;
        arrayPersonas[3]=jefe4;
        arrayPersonas[4]=jefe5;
        arrayPersonas[5]=jefe6;
        arrayPersonas[6]=comercial1;
        arrayPersonas[7]=comercial2;
        arrayPersonas[8]=comercial3;
        arrayPersonas[9]=tecnico1;
        
        for (int i = 0; i < arrayPersonas.length; i++) {
            Persona e=arrayPersonas[i];
            System.out.println("------------------------------");
            System.out.printf("%s %d:%n","Persona",i+1);
            System.out.println("------------------------------");
            System.out.println(e.toString());
            
        }
    } //Fin del main

} //Fin de la clase PrincipalPersona
