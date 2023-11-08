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
public class Evaluacion extends ActividadSumativa{
    
    private int limiteDeTiempo;
    
    public Evaluacion(String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, int limiteDeTiempo) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
    }

    public int getLimiteDeTiempo() {
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }
    
    
    
}
