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
class Profesor extends PersonalAcademico {

    private List<Curso> cursosACargo = new ArrayList();

    public Profesor(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public Profesor() {
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {

    }

    public void calificarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {

    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {

    }

    public void crearNuevoForo(Foro foro) {

    }

}
