
package com.portolio.antobackend.Interfaces;

import com.portolio.antobackend.Entidad.Persona;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProyectoDto {
    
    private String nombreproyecto;
    private String descripcion;
    private String enlace;
    private Persona persona;
    private String persona_id;

    public ProyectoDto() {
    }

    public ProyectoDto(String nombreproyecto, String descripcion, String enlace, Persona persona) {
        this.nombreproyecto = nombreproyecto;
        this.descripcion = descripcion;
        this.enlace = enlace;
        this.persona = persona;
    }
    
    
}