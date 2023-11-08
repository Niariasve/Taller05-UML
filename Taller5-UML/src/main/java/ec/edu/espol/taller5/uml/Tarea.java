/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller5.uml;

import java.time.LocalDateTime;

/**
 *
 * @author CltControl
 */
public class Tarea extends ActividadSumativa{
    
    private LocalDateTime fechaDePublicacion;
    
    public Tarea(String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, LocalDateTime fechaDePublicacion) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
    }

    public LocalDateTime getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDateTime fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
    
    
}
