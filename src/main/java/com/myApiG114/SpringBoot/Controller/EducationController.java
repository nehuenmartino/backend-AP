
package com.myApiG114.SpringBoot.Controller;

import com.myApiG114.SpringBoot.Model.Education;
import com.myApiG114.SpringBoot.Service.EducationService;
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
@CrossOrigin(origins ={"https://front-end-login-2fa10.web.app"})
public class EducationController {
    @Autowired
    EducationService eduService;
    @GetMapping("/educacion/{idPerson}")
    public List<Education> obtenerRegistrosEducacion(@PathVariable Long idPerson){
     return eduService.obtenerRegistrosEducacion(idPerson);
    }
    @DeleteMapping("/educacion/{id}")
    public void eliminarEducacion(@PathVariable Long id){
    eduService.eliminarEducacion(id);
    } 
    
    @PostMapping("/educacion/crear")
    public void crearEducacion(@RequestBody Education education){
        eduService.crearEducacion(education);
    }
    @PutMapping("/educacion/editar")
    public void modificarEducacion(@RequestBody Education education){
        eduService.modificarEducacion(education);
    }
}
