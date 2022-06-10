package com.portolio.antobackend.Controlador;

import com.portolio.antobackend.Entidad.Educacion;
import com.portolio.antobackend.Interfaces.EducacionDto;
import com.portolio.antobackend.Servicio.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona/educacion")

public class EducacionControler {

    @Autowired
    EducacionService educacionService;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = educacionService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") Long id){
        if(!educacionService.existsById(id))
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        Educacion educacion = educacionService.getOne(id).get();
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody EducacionDto educacionDto){    
        Educacion educacion = new Educacion();
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setInstituto(educacionDto.getInstituto());
        educacion.setAnio(educacionDto.getAnio());  
        educacion.setPersona_id(educacionDto.getPersona_id()); 
        
        educacionService.save(educacion);
        return new ResponseEntity( HttpStatus.OK);
    }
     
     

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody EducacionDto educacionDto){
        
        Educacion educacion = educacionService.getOne(id).get();
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setInstituto(educacionDto.getInstituto());
        educacion.setAnio(educacionDto.getAnio());  
        educacionService.save(educacion);
        return new ResponseEntity( HttpStatus.OK);
    }
  
  

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Long id){
        if(!educacionService.existsById(id))
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        educacionService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }


    
}