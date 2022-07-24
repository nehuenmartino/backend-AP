
package com.myApiG114.SpringBoot.Service;

import com.myApiG114.SpringBoot.Model.Skill;
import com.myApiG114.SpringBoot.Repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillService {
    @Autowired
    SkillRepository skillRepo;
    
    public List<Skill> obtenerRegistrosHabilidades(Long idPerson){
        return skillRepo.findByIdPerson(idPerson);
    }
    
    public void eliminarHabilidad(Long id){
        skillRepo.deleteById(id);
    }
    
    public void crearHabilidad(Skill skill){
        skillRepo.save(skill);
    }
    
}
