package com.portolio.antobackend.Controlador;

import com.portolio.antobackend.Entidad.Experiencia;
import com.portolio.antobackend.Interfaces.ExperienciaDto;
import com.portolio.antobackend.Servicio.ExperienciaService;
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
@RequestMapping("/persona/experiencia")
public class ExperienciaControler {
    
    @Autowired
    ExperienciaService experienciaService;
    
    
     @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = experienciaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") Long id){
        if(!experienciaService.existsById(id))
            return new ResponseEntity( HttpStatus.NOT_FOUND);
        Experiencia experiencia = experienciaService.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody ExperienciaDto experienciaDto){    
         
        Experiencia experiencia = new Experiencia();
        
        experiencia.setEmpresa(experienciaDto.getEmpresa());
        experiencia.setCargo(experienciaDto.getCargo());
        experiencia.setAnio_ingreso(experienciaDto.getAnio_ingreso());
        experiencia.setAnio_egreso(experienciaDto.getAnio_egreso());
        experiencia.setPersona_id(experienciaDto.getPersona_id());     
           
        experienciaService.save(experiencia);
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
     
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody ExperienciaDto experienciaDto){
        
        Experiencia experiencia = new Experiencia();
        
        experiencia.setEmpresa(experienciaDto.getEmpresa());
        experiencia.setCargo(experienciaDto.getCargo());
        experiencia.setAnio_ingreso(experienciaDto.getAnio_ingreso());
        experiencia.setAnio_egreso(experienciaDto.getAnio_egreso());                        
        experienciaService.save(experiencia);
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
  
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Long id){
        if(!experienciaService.existsById(id))
            return new ResponseEntity( HttpStatus.NOT_FOUND);
        experienciaService.delete(id);
        return new ResponseEntity( HttpStatus.OK);
    }


    
}