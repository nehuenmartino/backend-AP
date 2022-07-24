
package com.myApiG114.SpringBoot.Service;

import com.myApiG114.SpringBoot.Model.Education;
import com.myApiG114.SpringBoot.Repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {
    @Autowired
    EducationRepository eduRepo;
    
    public List<Education> obtenerRegistrosEducacion(Long idPerson){
        return eduRepo.findByIdPerson(idPerson);
    }
    
    public void eliminarEducacion(Long id){
        eduRepo.deleteById(id);
    }
    
    public void crearEducacion(Education education){
        eduRepo.save(education);
    }
    public void modificarEducacion(Education education){
        eduRepo.save(education);
    }
}
