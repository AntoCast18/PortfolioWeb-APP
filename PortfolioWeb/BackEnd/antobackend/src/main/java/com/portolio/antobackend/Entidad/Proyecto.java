
package com.portolio.antobackend.Entidad;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Proyecto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProject;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String NomProy;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String DescriptionProy;
    
    @Size(min = 4, max = 100, message = "No cumple con la longitud")
    private String ImgProy;
   
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String urlProject;

    public Long getIdProject() {
        return idProject;
    }

    public void setIdProject(Long idProject) {
        this.idProject = idProject;
    }

    public String getNomProy() {
        return NomProy;
    }

    public void setNomProy(String NomProy) {
        this.NomProy = NomProy;
    }

    public String getDescriptionProy() {
        return DescriptionProy;
    }

    public void setDescriptionProy(String DescriptionProy) {
        this.DescriptionProy = DescriptionProy;
    }

    public String getDataEdu() {
        return ImgProy;
    }

    public void setImgProy(String ImgProy) {
        this.ImgProy = ImgProy;
    }

    public String getUrlProject() {
        return urlProject;
    }

    public void setUrlProject(String urlProject) {
        this.urlProject = urlProject;
    }

     
    
}
