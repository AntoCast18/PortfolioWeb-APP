package com.portolio.antobackend.Controlador;

import com.portolio.antobackend.Entidad.Experiencia;
import com.portolio.antobackend.Interfaces.ExperienciaInterf;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ExperienciaControler {
       
    @Autowired ExperienciaInterf expService;
    
    @GetMapping("/experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return expService.getExperiencia();
    }
    
    @PostMapping("/experiencia/add")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        expService.saveExperiencia(experiencia);
        return "La Experiencia fue creada exitosamente";
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia (@PathVariable Long id){
        expService.deleteExperiencia(id);
        return "La Experiencia fue eliminada exitosamente";
    }
     //URL: PUERTO/personas/editar/4/nombre & apellido & img
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
            @RequestParam("nombre")String nuevoNombre,
            @RequestParam("descripcion")String nuevoDescripcion,
            @RequestParam("data")String nuevoData){
        
        Experiencia experiencia = expService.findExperiencia(id);
        
        experiencia.setNomExperience(nuevoNombre);
        experiencia.setDescriptionExperience(nuevoDescripcion);
        experiencia.setDataExperience(nuevoData);
       
        expService.saveExperiencia(experiencia);
        return experiencia;
        
    }    
  
}