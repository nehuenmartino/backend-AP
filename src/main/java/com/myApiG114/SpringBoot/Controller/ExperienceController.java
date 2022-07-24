package com.myApiG114.SpringBoot.Controller;

import com.myApiG114.SpringBoot.Model.Experience;
import com.myApiG114.SpringBoot.Service.ExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins ={"http://localhost:4200/"})
public class ExperienceController {
    @Autowired
    ExperienceService expService;
    @GetMapping("/experiencia/{idPerson}")
    public List<Experience> obtenerRegistrosExperiencia(@PathVariable Long idPerson){
     return expService.obtenerRegistrosExperiencia(idPerson);
    }
    @DeleteMapping("/experiencia/{id}")
    public void eliminarExperiencia(@PathVariable Long id){
    expService.eliminarExperiencia(id);
    }
    
    @PostMapping("/experiencia/crear")
    public void crearExperiencia(@RequestBody Experience experience){
        expService.crearExperiencia(experience);
    }
    @PutMapping("/experiencia/editar")
    public void modificarExperiencia(@RequestBody Experience experience){
        expService.modificarExperiencia(experience);
    }
}