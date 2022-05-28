
package com.portolio.antobackend.Interfaces;

import com.portolio.antobackend.Entidad.Proyecto;
import java.util.List;


public interface ProyectoInterf{
    //traer una lista de Proyecto
    public List<Proyecto> getProyecto();
    //guardar un objeto de tipo Proyecto
    public void saveProyecto(Proyecto proyecto);
    //EliminarProyecto pero lo buscamos por ID
    public void deleteProyecto(Long id);
    //buscar Proyecto por id
    public Proyecto findProyecto(Long id);
}
