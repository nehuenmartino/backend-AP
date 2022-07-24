
package com.myApiG114.SpringBoot.Service;

import com.myApiG114.SpringBoot.Model.Project;
import com.myApiG114.SpringBoot.Repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
  @Autowired
    ProjectRepository proRepo;
    
    public List<Project> obtenerRegistrosProyectos(Long idPerson){
        return proRepo.findByIdPerson(idPerson);
    }
    
    public void eliminarProyecto(Long id){
        proRepo.deleteById(id);
    }
    
    public void crearProyecto(Project project){
        proRepo.save(project);
    }
    public void modificarProyecto(Project project){
        proRepo.save(project);
    }  
}
