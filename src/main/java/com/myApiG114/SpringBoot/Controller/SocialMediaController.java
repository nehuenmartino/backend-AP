
package com.myApiG114.SpringBoot.Controller;

import com.myApiG114.SpringBoot.Model.SocialMedia;
import com.myApiG114.SpringBoot.Service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins ={"http://localhost:4200/"})
public class SocialMediaController {
    @Autowired
    SocialMediaService socService;
    @GetMapping("/redes/{idPerson}")
    public SocialMedia obtenerRegistrosRedes(@PathVariable Long idPerson){
     return socService.obtenerRegistrosRedes(idPerson);
    }
    @PutMapping("/redes/editar")
    public void modificarRedes(@RequestBody SocialMedia socialMedia){
        socService.modificarRedes(socialMedia);
    }
}
