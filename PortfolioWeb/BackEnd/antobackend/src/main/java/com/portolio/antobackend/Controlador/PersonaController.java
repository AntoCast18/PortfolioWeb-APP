
package com.portolio.antobackend.Controlador;

import com.portolio.antobackend.Entidad.Persona;
import com.portolio.antobackend.Interfaces.IpersonaService;
import com.portolio.antobackend.Servicio.ImpPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin (origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    ImpPersonaService personaService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = personaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") Long id){
        if(!personaService.existsById(id))
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        Persona persona = personaService.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @PostMapping("/create")
     public ResponseEntity<?> create(@RequestBody IpersonaService personaDto){    
        Persona persona = new Persona();
        persona.setNombre(personaDto.getNombre());
        persona.setApellido(personaDto.getApellido());
        persona.setImg(personaDto.getImg());
        personaService.save(persona);
        return new ResponseEntity(persona, HttpStatus.OK);
    }  

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody IpersonaService personaDto){
        
        Persona persona = personaService.getOne(id).get();
        persona.setNombre(personaDto.getNombre());
        persona.setApellido(personaDto.getApellido());
        persona.setImg(personaDto.getImg());
        personaService.save(persona);
        return new ResponseEntity(persona, HttpStatus.OK);
    }
  
  

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Long id){
        if(!personaService.existsById(id))
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        personaService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @GetMapping("/traer/perfil")
    public Persona findPersona(){
       return personaService.findPersona((long)1);
    }
}