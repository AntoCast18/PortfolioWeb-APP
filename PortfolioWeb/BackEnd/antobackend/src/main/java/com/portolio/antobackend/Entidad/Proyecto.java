
package com.portolio.antobackend.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter
@Entity
@Table(name = "proyecto")
public class Proyecto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    private String nombreproyecto;
    private String descripcion;
    private String enlace;
   private String persona_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "persona_id", nullable = false, insertable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Persona persona;


    public Proyecto() {
    }

    public Proyecto(Long id, String nombreproyecto, String descripcion, String enlace, Persona persona) {
        this.id = id;
        this.nombreproyecto = nombreproyecto;
        this.descripcion = descripcion;
        this.enlace = enlace;
        this.persona = persona;
    }

   }