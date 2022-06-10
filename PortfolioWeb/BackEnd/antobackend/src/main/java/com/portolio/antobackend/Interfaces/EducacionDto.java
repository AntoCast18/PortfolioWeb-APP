package com.portolio.antobackend.Interfaces;

import com.portolio.antobackend.Entidad.Persona;
import lombok.Getter;
import lombok.Setter;

    
@Getter @Setter
public class EducacionDto {
    
    private String titulo;
    private String instituto;
    private String anio;
    private Persona persona;
    private String persona_id;

    public EducacionDto() {
    }

    public EducacionDto(String titulo, String instituto, String anio, Persona persona) {
        this.titulo = titulo;
        this.instituto = instituto;
        this.anio = anio;
        this.persona = persona;
    }
    
    
}