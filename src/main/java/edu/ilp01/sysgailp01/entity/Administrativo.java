package edu.ilp01.sysgailp01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Administrativo extends Persona{

   @Column(name = "codigo_admin",length = 10)
    private String codigoAdmin;
    @Column(name = "cargo",length = 50)
    private String cargo;

    public String getCodigoAdmin() {
        return codigoAdmin;
    }

    public void setCodigoAdmin(String codigoAdmin) {
        this.codigoAdmin = codigoAdmin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Administrativo() {
    }

    public Administrativo(String codigoAdmin) {
        this.codigoAdmin = codigoAdmin;
    }

    public Administrativo(String codigoAdmin, String cargo) {
        this.codigoAdmin = codigoAdmin;
        this.cargo = cargo;
    }

    public Administrativo(Long idpersona, String codigoAdmin, String cargo) {
        super(idpersona);
        this.codigoAdmin = codigoAdmin;
        this.cargo = cargo;
    }

    public Administrativo(Long idpersona, String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigoAdmin, String cargo) {
        super(idpersona, nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigoAdmin = codigoAdmin;
        this.cargo = cargo;
    }
}
