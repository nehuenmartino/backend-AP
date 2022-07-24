
package com.myApiG114.SpringBoot.Controller;

import com.myApiG114.SpringBoot.Model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.myApiG114.SpringBoot.Service.SkillService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins ={"http://localhost:4200/"})
public class SkillController {
    @Autowired
    SkillService skillService;
    @GetMapping("/habilidades/{idPerson}")
    public List<Skill> obtenerRegistrosHabilidades(@PathVariable Long idPerson){
     return skillService.obtenerRegistrosHabilidades(idPerson);
    }
    @DeleteMapping("/habilidades/{id}")
    public void eliminarHabilidad(@PathVariable Long id){
    skillService.eliminarHabilidad(id);
    }    
    
    @PostMapping("/habilidades/crear")
    public void crearHabilidad(@RequestBody Skill skill){
        skillService.crearHabilidad(skill);
    }
}
