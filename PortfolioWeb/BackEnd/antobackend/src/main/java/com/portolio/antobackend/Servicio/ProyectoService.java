
package com.portolio.antobackend.Servicio;

import com.portolio.antobackend.Entidad.Proyecto;
import com.portolio.antobackend.Interfaces.ProyectoInterf;
import com.portolio.antobackend.Repositorio.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements ProyectoInterf{
    
    @Autowired ProyectoRepo proRepository;
    
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = proRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        proRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = proRepository.findById(id).orElse(null);
        return proyecto;
    }
    
}
