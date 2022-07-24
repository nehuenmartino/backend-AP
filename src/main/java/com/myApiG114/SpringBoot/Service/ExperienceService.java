
package com.myApiG114.SpringBoot.Service;

import com.myApiG114.SpringBoot.Model.Experience;
import com.myApiG114.SpringBoot.Repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {
    @Autowired
    ExperienceRepository expRepo;
    
    public List<Experience> obtenerRegistrosExperiencia(Long idPerson){
        return expRepo.findByIdPerson(idPerson);
    }
    
    public void eliminarExperiencia(Long id){
        expRepo.deleteById(id);
    }
    
    public void crearExperiencia(Experience experience){
        expRepo.save(experience);
    }
    public void modificarExperiencia(Experience experience){
        expRepo.save(experience);
    }
}
