
package com.portolio.antobackend.Interfaces;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class IpersonaService {
    
  
    private String nombre;
    private String apellido;  
    private String img;

    public IpersonaService() {
    }
    
    public IpersonaService(String nombre, String apellido, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
    }
    
}