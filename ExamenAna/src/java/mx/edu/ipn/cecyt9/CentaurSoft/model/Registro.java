/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.CentaurSoft.model;

import java.io.Serializable;
/**
 *
 * @author Alumno
 */

public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idInformacion;
    private String nombre;
    private String apellidop;
    private String apellidom;
    private String escuela;
    private String materiafav;
    private String deportefav;

    public Registro() {
    }

    public Registro(Integer idRegistro) {
        this.idInformacion = idRegistro;
    }

    public Registro(Integer idInformacion, String nombre, String apellidop, String apellidom, String escuela, String materiafav, String deportefav) {
        this.idInformacion = idInformacion;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.escuela = escuela;
        this.materiafav = materiafav;
        this.deportefav = deportefav;
    }

    public Integer getIdInformacion() {
        return idInformacion;
    }

    public void setIdInformacion(Integer idInformacion) {
        this.idInformacion = idInformacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getMateriafav() {
        return materiafav;
    }

    public void setMateriafav(String materiafav) {
        this.materiafav = materiafav;
    }

    public String getDeportefav() {
        return deportefav;
    }

    public void setDeportefav(String deportefav) {
        this.deportefav = deportefav;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformacion != null ? idInformacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idInformacion == null && other.idInformacion != null) || (this.idInformacion != null && !this.idInformacion.equals(other.idInformacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.CentaurSoft.model.Registro[ idRegistro=" + idInformacion + " ]";
    }
    
}
