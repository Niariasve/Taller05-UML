/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller5.uml;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Incidente {

    private Usuario responsable;
    protected int id;
    protected LocalDateTime fecha_reportad;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    protected PersonalAcademico beneficiario;

    public Incidente(Usuario responsable, int id, LocalDateTime fecha_reportad, String titulo, String descripcion, List<String> log_actualizaciones, LocalDateTime fecha_cerrado, String tipo, PersonalAcademico beneficiario) {
        this.responsable = responsable;
        this.id = id;
        this.fecha_reportad = fecha_reportad;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
        this.beneficiario = beneficiario;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha_reportad() {
        return fecha_reportad;
    }

    public void setFecha_reportad(LocalDateTime fecha_reportad) {
        this.fecha_reportad = fecha_reportad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getLog_actualizaciones() {
        return log_actualizaciones;
    }

    public void setLog_actualizaciones(List<String> log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }

    public LocalDateTime getFecha_cerrado() {
        return fecha_cerrado;
    }

    public void setFecha_cerrado(LocalDateTime fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PersonalAcademico getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(PersonalAcademico beneficiario) {
        this.beneficiario = beneficiario;
    }

}
