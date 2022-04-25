package edu.ilp01.sysgailp01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Docente extends Persona{
    @Column(name = "cod_docente",length = 15)
    private  String CodDocente;
    @Column(name = "horas_asignadas",length = 20)
    private  Double HorasAsignadas;

    public String getCodDocente() {
        return CodDocente;
    }

    public void setCodDocente(String codDocente) {
        CodDocente = codDocente;
    }

    public Double getHorasAsignadas() {
        return HorasAsignadas;
    }

    public void setHorasAsignadas(Double horasAsignadas) {
        HorasAsignadas = horasAsignadas;
    }

    public Docente() {
    }

    public Docente(String codDocente) {
        CodDocente = codDocente;
    }

    public Docente(String codDocente, Double horasAsignadas) {
        CodDocente = codDocente;
        HorasAsignadas = horasAsignadas;
    }

    public Docente(Long idpersona, String codDocente, Double horasAsignadas) {
        super(idpersona);
        CodDocente = codDocente;
        HorasAsignadas = horasAsignadas;
    }

    public Docente(Long idpersona, String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codDocente, Double horasAsignadas) {
        super(idpersona, nombre, apellido, edad, dni, fechaNacimiento, genero);
        CodDocente = codDocente;
        HorasAsignadas = horasAsignadas;
    }
}
