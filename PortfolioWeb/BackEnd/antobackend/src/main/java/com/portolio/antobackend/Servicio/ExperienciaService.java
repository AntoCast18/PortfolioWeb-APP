
package com.portolio.antobackend.Servicio;

import com.portolio.antobackend.Entidad.Experiencia;
import com.portolio.antobackend.Repositorio.ExperienciaRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ExperienciaService {
    
    @Autowired  ExperienciaRepo exRepo;
    
    
     public List<Experiencia> list(){
        return exRepo.findAll();
    }

    
    public Optional<Experiencia> getOne(Long id){
        return exRepo.findById(id);
    }

  

    public void  save(Experiencia experiencia){
        exRepo.save(experiencia);
    }
    
    public void delete(Long id){
        exRepo.deleteById(id);
    }

    public boolean existsById(Long id){
        return exRepo.existsById(id);
    }
}