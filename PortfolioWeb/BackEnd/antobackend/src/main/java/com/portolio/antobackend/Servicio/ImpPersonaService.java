
package com.portolio.antobackend.Servicio;

import com.portolio.antobackend.Entidad.Persona;
import com.portolio.antobackend.Repositorio.IPersonaRepositorio;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService {
    
    @Autowired IPersonaRepositorio ipersonaRepository;
    
     public List<Persona> list() {
       return  ipersonaRepository.findAll();
   }
   
   public Optional<Persona> getOne(Long id) {
       return ipersonaRepository.findById(id);
   }
   
   public void  save(Persona persona){
         ipersonaRepository.save(persona);
    }
    
    public void delete(Long id){
         ipersonaRepository.deleteById(id);
    }

    public boolean existsById(Long id){
        return  ipersonaRepository.existsById(id);
    }

    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
        } 
    
}