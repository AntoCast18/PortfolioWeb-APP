package com.portolio.antobackend.Controlador;

import com.portolio.antobackend.Entidad.Educacion;
import com.portolio.antobackend.Interfaces.EducacionInterf;

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

public class EducacionControler {
       
    @Autowired EducacionInterf eduService;
    
    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion(){
        return eduService.getEducacion();
    }
    
    @PostMapping("/educacion/add")
    public String createEducacion(@RequestBody Educacion educacion){
        eduService.saveEducacion(educacion);
        return "La EEducacion fue creada exitosamente";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id){
        eduService.deleteEducacion(id);
        return "La Educacion fue eliminada exitosamente";
    }
     //URL: PUERTO/personas/editar/4/nombre & apellido & img
    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
            @RequestParam("nombre")String nuevoNombre,
            @RequestParam("descripcion")String nuevoDescripcion,
            @RequestParam("data")String nuevoData){
        
        Educacion educacion = eduService.findEducacion(id);
        
        educacion.setNomEdu(nuevoNombre);
        educacion.setDescriptionEdu(nuevoDescripcion);
        educacion.setDataEdu(nuevoData);
       
        eduService.saveEducacion(educacion);
        return educacion;
        
    }    
  
}