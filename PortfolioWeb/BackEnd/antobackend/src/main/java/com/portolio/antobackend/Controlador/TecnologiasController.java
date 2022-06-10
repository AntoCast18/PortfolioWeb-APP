/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portolio.antobackend.Controlador;

import com.portolio.antobackend.Entidad.Tecnologias;
import com.portolio.antobackend.Interfaces.TecnologiasDto;
import com.portolio.antobackend.Servicio.TecnologiasService;
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

/**
 *
 * @author Antonella
 */
@RestController
@RequestMapping("/persona/tecnologias")
public class TecnologiasController {
    
     @Autowired
    TecnologiasService tecnologiasService;

    @GetMapping("/lista")
    public ResponseEntity<List<Tecnologias>> list(){
        List<Tecnologias> list = tecnologiasService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
 
    @GetMapping("/detail/{id}")
    public ResponseEntity<Tecnologias> getById(@PathVariable("id") Long id){
        if(!tecnologiasService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Tecnologias tecnologias = tecnologiasService.getOne(id).get();
        return new ResponseEntity(tecnologias, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody TecnologiasDto tecnologiasDto){    
        Tecnologias tecnologias = new Tecnologias();
        tecnologias.setLenguaje(tecnologiasDto.getLenguaje());
        tecnologias.setPorcentaje(tecnologiasDto.getPorcentaje());
        tecnologias.setPersona_id(tecnologiasDto.getPersona_id());   
        
        tecnologiasService.save(tecnologias);
        return new ResponseEntity( HttpStatus.OK);
    }
     
     

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody TecnologiasDto tecnologiasDto){
        
        Tecnologias tecnologias = tecnologiasService.getOne(id).get();
        tecnologias.setLenguaje(tecnologiasDto.getLenguaje());
        tecnologias.setPorcentaje(tecnologiasDto.getPorcentaje());        
        tecnologiasService.save(tecnologias);
        tecnologiasService.save(tecnologias);        
        return new ResponseEntity(new Mensaje("Registro de Lenguaje Actualizado"), HttpStatus.OK);
    }
  
  

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Long id){
        if(!tecnologiasService.existsById(id))
            return new ResponseEntity(new Mensaje("No se encontro ningun registro de lenguaje"), HttpStatus.NOT_FOUND);
        tecnologiasService.delete(id);
        return new ResponseEntity(new Mensaje("Lenguaje eliminado"), HttpStatus.OK);
    }
}