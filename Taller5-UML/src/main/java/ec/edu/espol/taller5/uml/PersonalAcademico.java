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
class PersonalAcademico extends Usuario {

    protected List<Incidente> indicentes = new ArrayList();

    public PersonalAcademico(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public PersonalAcademico() {
    }

    public void reportarError(String email, String contenido) {

    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {

    }

    public void comentarEnForo(Foro foro, String comentario) {

    }

}
