/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller5.uml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Estudiante {

    private List<Curso> cursosInscrito = new ArrayList();
    private List<Curso> cursosEnEsperaDeInscripcion = new ArrayList();

    public void solicitarInscripcion(Curso curso) {

    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {

    }

    public Estudiante() {
    }

    public List<Curso> getCursosInscrito() {
        return cursosInscrito;
    }

    public void setCursosInscrito(List<Curso> cursosInscrito) {
        this.cursosInscrito = cursosInscrito;
    }

    public List<Curso> getCursosEnEsperaDeInscripcion() {
        return cursosEnEsperaDeInscripcion;
    }

    public void setCursosEnEsperaDeInscripcion(List<Curso> cursosEnEsperaDeInscripcion) {
        this.cursosEnEsperaDeInscripcion = cursosEnEsperaDeInscripcion;
    }

    
}
