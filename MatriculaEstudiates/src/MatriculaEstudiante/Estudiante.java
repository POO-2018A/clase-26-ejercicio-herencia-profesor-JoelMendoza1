/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatriculaEstudiante;

import java.util.ArrayList;

/**
 *
 * @author ESFOT
 */
public class Estudiante extends Persona{
  
   private ArrayList<Materia> materias;
   private int edad; 

    public Estudiante(String nombre, String apellido,  int edad) {
        super(nombre, apellido);
      
        this.materias= new ArrayList <>();
        this.edad = edad;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  nombre + " "+apellido ;
    }
    
    
   
}
