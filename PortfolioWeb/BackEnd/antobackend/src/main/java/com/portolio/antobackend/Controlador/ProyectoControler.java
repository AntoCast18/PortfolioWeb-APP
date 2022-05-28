package com.portolio.antobackend.Controlador;

import com.portolio.antobackend.Entidad.Proyecto;
import com.portolio.antobackend.Interfaces.ProyectoInterf;

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

public class ProyectoControler {
       
    @Autowired ProyectoInterf proService;
    
    @GetMapping("/proyecto/traer")
    public List<Proyecto> getProyecto(){
        return proService.getProyecto();
    }
    
    @PostMapping("/proyecto/add")
    public String createProyecto(@RequestBody Proyecto proyecto){
        proService.saveProyecto(proyecto);
        return " Proyecto fue creado exitosamente";
    }
    
    @DeleteMapping("/proyecto/borrar/{id}")
    public String deleteProyecto (@PathVariable Long id){
        proService.deleteProyecto(id);
        return "Proyecto fue eliminada exitosamente";
    }
     //URL: PUERTO/personas/editar/4/nombre & apellido & img
    @PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
            @RequestParam("nombre")String nuevoNombre,
            @RequestParam("descripcion")String nuevoDescripcion,
            @RequestParam("img")String nuevoImg,
            @RequestParam("url")String nuevoUrl){
        
        Proyecto proyecto = proService.findProyecto(id);
        
        proyecto.setNomProy(nuevoNombre);
        proyecto.setDescriptionProy(nuevoDescripcion);
        proyecto.setImgProy(nuevoImg);
        proyecto.setUrlProject(nuevoUrl);
       
        proService.saveProyecto(proyecto);
        return proyecto;
    }
    }    
  