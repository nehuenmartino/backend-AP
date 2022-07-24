
package com.myApiG114.SpringBoot.Service;

import com.myApiG114.SpringBoot.Model.SocialMedia;
import com.myApiG114.SpringBoot.Repository.SocialMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialMediaService {
    @Autowired
    SocialMediaRepository socRepo;
    
    public SocialMedia obtenerRegistrosRedes(Long idPerson){
        return socRepo.findByIdPerson(idPerson);
    }
    public void modificarRedes(SocialMedia socialMedia){
        socRepo.save(socialMedia);
    }
}
