package com.portolio.antobackend.Interfaces;

import com.portolio.antobackend.Entidad.Persona;


public class ExperienciaDto {
    
    private String empresa;
    private String cargo;
    private String anio_ingreso;
    private String anio_egreso;
    private Persona persona;
    private String persona_id;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(String anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public String getAnio_egreso() {
        return anio_egreso;
    }

    public void setAnio_egreso(String anio_egreso) {
        this.anio_egreso = anio_egreso;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(String persona_id) {
        this.persona_id = persona_id;
    }

    
    public ExperienciaDto() {
    }

    public ExperienciaDto(String empresa, String cargo, String anio_ingreso, String anio_egreso, Persona persona) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
        this.persona = persona;
    }
}
       
