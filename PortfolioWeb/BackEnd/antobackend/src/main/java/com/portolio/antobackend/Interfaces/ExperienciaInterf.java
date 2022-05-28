
package com.portolio.antobackend.Interfaces;

import com.portolio.antobackend.Entidad.Experiencia;
import java.util.List;


public interface ExperienciaInterf{
    //traer una lista de Experiencia
    public List<Experiencia> getExperiencia();
    //guardar un objeto de tipo Experiencia
    public void saveExperiencia(Experiencia experiencia);
    //Eliminar Experiencia pero lo buscamos por ID
    public void deleteExperiencia(Long id);
    //buscar Experiencia por id
    public Experiencia findExperiencia(Long id);
}
