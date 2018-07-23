/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatriculaEstudiante;

import java.util.ArrayList;

/**
 *
 * @author Karen
 */
public class Profesor extends Persona {
   
    private String materias;
    private String facultad; 
    
    public Profesor(String nombre, String apellido, String facultad, String materias) {
        super(nombre, apellido);
        this.materias=materias;
        this.facultad=facultad;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
   
    
}
