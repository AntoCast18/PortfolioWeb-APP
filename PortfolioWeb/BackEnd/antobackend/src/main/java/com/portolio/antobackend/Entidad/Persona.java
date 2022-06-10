package com.portolio.antobackend.Entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)   
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String Nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String Apellido;
    
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String img;
    
    public Persona() {
    }

    public Persona(Long id, String Nombre, String Apellido, String img) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.img = img;
        
    }

    public Persona(String Nombre, String Apellido, String img) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.img = img;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


//** Relaciones

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn( name = "id_persona", referencedColumnName = "id")
    List<Educacion> educacion= new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    List<Experiencia> experiencia = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    List<Proyecto> proyecto = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    List<Tecnologias> tecnologias= new ArrayList<>();


}