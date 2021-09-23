package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author CFGS
 */

public class EjercicioPrintf {
    public static void main(String[] args) {
        Alumnos alumno1=new Alumnos("Miguel Ángel","Martín Szelest");
        Alumnos alumno2=new Alumnos("Frankz","Bañón");
        Alumnos alumno3=new Alumnos("Carlos","Bermejo");
        Alumnos alumno4=new Alumnos("Diego","Cáceres");
        Alumnos alumno5=new Alumnos("Victor","Caja");
        Alumnos alumno6=new Alumnos("Constantin","Carabut");
        Alumnos alumno7=new Alumnos("Víctor Manuel","De Pablo");
        Alumnos alumno8=new Alumnos("Jorge","González");
        Alumnos alumno9=new Alumnos("Sergio","Gutiérrez");
        Alumnos alumno10=new Alumnos("Alejandro","Plaza");
        Alumnos alumno11=new Alumnos("Eizan","Rosa");
        Alumnos alumno12=new Alumnos("Pedro Enrique","Vidal");
        
        List<Alumnos> alumno=new LinkedList<>();
        alumno.add(alumno1);
        alumno.add(alumno2);
        alumno.add(alumno3);
        alumno.add(alumno4);
        alumno.add(alumno5);
        alumno.add(alumno6);
        alumno.add(alumno7);
        alumno.add(alumno8);
        alumno.add(alumno9);
        alumno.add(alumno10);
        alumno.add(alumno11);
        alumno.add(alumno12);
        
        System.out.printf("%-9s%-17s%-18s%s%n------------------------------------------------%n", "ID", "Apellido", "Nombre", "Nota");
        
        for (Iterator<Alumnos> it = alumno.iterator(); it.hasNext();) {
            Alumnos e = it.next();
            System.out.printf("%-9d%-17s%-18s%.2f%n", e.getID(),e.getApellido(),e.getNombre(),e.getNota());
        }
/*
        alumno.forEach((e) -> {
            System.out.printf("%-9d%-17s%-18s%.2f%n", e.getID(),e.getApellido(),e.getNombre(),e.getNota());
        });
*/
    } //Fin del main

} //Fin de la clase EjercicioPrintf
