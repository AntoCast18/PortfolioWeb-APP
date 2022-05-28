
package com.portolio.antobackend.Servicio;

import com.portolio.antobackend.Entidad.Experiencia;
import com.portolio.antobackend.Interfaces.ExperienciaInterf;
import com.portolio.antobackend.Repositorio.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements ExperienciaInterf{
    
    @Autowired ExperienciaRepo expRepository;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = expRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        expRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = expRepository.findById(id).orElse(null);
        return experiencia;
    }
    
}
