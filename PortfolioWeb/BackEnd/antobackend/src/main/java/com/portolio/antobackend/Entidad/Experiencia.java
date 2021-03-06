package com.portolio.antobackend.Entidad;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@NoArgsConstructor
@Getter @Setter
@Table(name = "experiencia")
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empresa;
    private String cargo;
    private String anio_ingreso;
    private String anio_egreso;
    private String persona_id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "persona_id", nullable = false, insertable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Persona persona;

    
    public Experiencia(Long id, String empresa, String cargo, String anio_ingreso, String anio_egreso, Persona persona, String persona_id) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
        this.persona = persona;
        this.persona_id = persona_id;
    }
}