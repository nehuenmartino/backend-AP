
package com.myApiG114.SpringBoot.Controller;

import com.myApiG114.SpringBoot.Model.Project;
import com.myApiG114.SpringBoot.Service.ProjectService;
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
public class ProjectController {
    @Autowired
    ProjectService proService;
    @GetMapping("/proyectos/{idPerson}")
    public List<Project> obtenerRegistrosEducacion(@PathVariable Long idPerson){
     return proService.obtenerRegistrosProyectos(idPerson);
    }
    @DeleteMapping("/proyectos/{id}")
    public void eliminarProyecto(@PathVariable Long id){
    proService.eliminarProyecto(id);
    }
    
    @PostMapping("/proyectos/crear")
    public void crearEducacion(@RequestBody Project project){
        proService.crearProyecto(project);
    }
    @PutMapping("/proyectos/editar")
    public void modificarEducacion(@RequestBody Project project){
        proService.modificarProyecto(project);
    }
}
