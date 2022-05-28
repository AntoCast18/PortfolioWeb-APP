package com.portolio.antobackend.Entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExperience;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String NomExperience;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String DescriptionExperience;
    
    @Size(min = 4, max = 4, message = "No cumple con la longitud")
    private String DataExperience;

    public Long getIdExperience() {
        return idExperience;
    }

    public void setIdExperience(Long idExperience) {
        this.idExperience = idExperience;
    }

    public String getNomExperience() {
        return NomExperience;
    }

    public void setNomExperience(String NomExperience) {
        this.NomExperience = NomExperience;
    }

    public String getDescriptionExperience() {
        return DescriptionExperience;
    }

    public void setDescriptionExperience(String DescriptionExperience) {
        this.DescriptionExperience = DescriptionExperience;
    }

    public String getDataExperience() {
        return DataExperience;
    }

    public void setDataExperience(String DataExperience) {
        this.DataExperience = DataExperience;
    }
}
