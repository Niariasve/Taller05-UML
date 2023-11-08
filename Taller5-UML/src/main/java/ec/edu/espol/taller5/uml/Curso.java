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
class Curso {

    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;

    public Curso(String id, String nombre, boolean estadoDisponible, Profesor responsable) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.responsable = responsable;
    }

    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList();
    private List<Estudiante> estudiantesInscritos = new ArrayList();
    private List<Foro> foros = new ArrayList();

    private List<ActividadSumativa> actividadesSumativas = new ArrayList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public Profesor getResponsable() {
        return responsable;
    }

    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }

    public List<Estudiante> getEstudiantesEnEsperaDeInscripcion() {
        return estudiantesEnEsperaDeInscripcion;
    }

    public void setEstudiantesEnEsperaDeInscripcion(List<Estudiante> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public List<Foro> getForos() {
        return foros;
    }

    public void setForos(List<Foro> foros) {
        this.foros = foros;
    }

    public List<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }

    public void setActividadesSumativas(List<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }

    
}
