
package com.portolio.antobackend.Servicio;

import com.portolio.antobackend.Entidad.Tecnologias;
import com.portolio.antobackend.Repositorio.TecnologiasRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Antonella
 */
@Service
@Transactional
public class TecnologiasService {
    
    @Autowired
    TecnologiasRepository tecnologiasRepository;

    
    public List<Tecnologias> list(){
        return tecnologiasRepository.findAll();
    }

    
    public Optional<Tecnologias> getOne(Long id){
        return tecnologiasRepository.findById(id);
    }

    public void  save(Tecnologias tecnologias){
        tecnologiasRepository.save(tecnologias);
    }
    
    public void delete(Long id){
        tecnologiasRepository.deleteById(id);
    }

    public boolean existsById(Long id){
        return tecnologiasRepository.existsById(id);
    }
}