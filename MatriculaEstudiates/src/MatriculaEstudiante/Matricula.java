/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatriculaEstudiante;

/**
 *
 * @author Karen
 */
public class Matricula {
    
    private String estudiante;
    private String materia;
   // private ArrayList<Materia> materias;

    public Matricula(String estudiante, String materia) {
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return estudiante + materia ;
    }
    
    
}
