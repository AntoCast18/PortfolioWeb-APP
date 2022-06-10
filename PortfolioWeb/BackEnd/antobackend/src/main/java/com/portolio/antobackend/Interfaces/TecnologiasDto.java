
package com.portolio.antobackend.Interfaces;

import com.portolio.antobackend.Entidad.Persona;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TecnologiasDto {
    
    private String lenguaje;
    private String porcentaje;
    private Persona persona;
    private String persona_id;

    public TecnologiasDto() {
    }

    public TecnologiasDto(String lenguaje, String porcentaje, Persona persona) {
        this.lenguaje = lenguaje;
        this.porcentaje = porcentaje;
         this.persona = persona;
    }
    
    
}
