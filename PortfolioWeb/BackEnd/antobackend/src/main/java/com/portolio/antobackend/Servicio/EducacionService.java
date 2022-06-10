
package com.portolio.antobackend.Servicio;

import com.portolio.antobackend.Entidad.Educacion;
import com.portolio.antobackend.Repositorio.EducacionRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    
    @Autowired EducacionRepo eduRepo;
    
    
     public List<Educacion> list(){
        return eduRepo.findAll();
    }

    
    public Optional<Educacion> getOne(Long id){
        return eduRepo.findById(id);
    }

  

    public void  save(Educacion educacion){
        eduRepo.save(educacion);
    }
    
    public void delete(Long id){
        eduRepo.deleteById(id);
    }

    public boolean existsById(Long id){
        return eduRepo.existsById(id);
    }
}