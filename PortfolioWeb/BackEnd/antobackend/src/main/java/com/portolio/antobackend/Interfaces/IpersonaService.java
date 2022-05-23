
package com.portolio.antobackend.Interfaces;

import com.portolio.antobackend.Entidad.Persona;
import java.util.List;


public interface IpersonaService {
    //traer una lista de persosas
    public List<Persona> getPersona();
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    //Eliminar un usuario pero lo buscamos por ID
    public void deletePersona(Long id);
    //buscar una persona por id
    public Persona findPersona(Long id);
}
