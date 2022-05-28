
package com.portolio.antobackend.Entidad;
//import java.io.Serializable;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String NomEdu;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String DescriptionEdu;
    
    @Size(min = 4, max = 4, message = "No cumple con la longitud")
    private String DataEdu;

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getNomEdu() {
        return NomEdu;
    }

    public void setNomEdu(String NomEdu) {
        this.NomEdu = NomEdu;
    }

    public String getDescriptionEdu() {
        return DescriptionEdu;
    }

    public void setDescriptionEdu(String DescriptionEdu) {
        this.DescriptionEdu = DescriptionEdu;
    }

    public String getDataEdu() {
        return DataEdu;
    }

    public void setDataEdu(String DataEdu) {
        this.DataEdu = DataEdu;
    }
    
    
}
