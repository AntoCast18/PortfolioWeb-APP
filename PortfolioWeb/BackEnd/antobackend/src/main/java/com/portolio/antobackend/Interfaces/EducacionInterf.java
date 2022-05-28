
package com.portolio.antobackend.Interfaces;

import com.portolio.antobackend.Entidad.Educacion;
import java.util.List;


public interface EducacionInterf{
    //traer una lista de Educacion
    public List<Educacion> getEducacion();
    //guardar un objeto de tipo Educacion
    public void saveEducacion(Educacion educacion);
    //Eliminar Educacion pero lo buscamos por ID
    public void deleteEducacion(Long id);
    //buscar Educacion por id
    public Educacion findEducacion(Long id);
}
