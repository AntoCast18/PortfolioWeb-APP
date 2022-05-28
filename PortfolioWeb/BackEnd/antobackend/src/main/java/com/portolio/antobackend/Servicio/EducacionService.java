
package com.portolio.antobackend.Servicio;

import com.portolio.antobackend.Entidad.Educacion;
import com.portolio.antobackend.Interfaces.EducacionInterf;
import com.portolio.antobackend.Repositorio.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements EducacionInterf{
    
    @Autowired EducacionRepo eduRepository;
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = eduRepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        eduRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = eduRepository.findById(id).orElse(null);
        return educacion;
    }
    
}
