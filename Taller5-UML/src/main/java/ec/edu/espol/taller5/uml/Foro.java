/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller5.uml;

/**
 *
 * @author CltControl
 */
class Foro {
    
    private String id;
    private String tematica;
    private int numeroComentarios;
    private Curso cursoAsignado;

    public Foro(String id, String tematica, int numeroComentarios, Curso cursoAsignado) {
        this.id = id;
        this.tematica = tematica;
        this.numeroComentarios = numeroComentarios;
        this.cursoAsignado = cursoAsignado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getNumeroComentarios() {
        return numeroComentarios;
    }

    public void setNumeroComentarios(int numeroComentarios) {
        this.numeroComentarios = numeroComentarios;
    }

    public Curso getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(Curso cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }
    
    
}
