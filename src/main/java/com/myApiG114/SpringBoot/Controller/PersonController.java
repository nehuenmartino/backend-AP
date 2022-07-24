package com.myApiG114.SpringBoot.Controller;

import com.myApiG114.SpringBoot.Model.Person;
import com.myApiG114.SpringBoot.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ={"http://localhost:4200/"})
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/persona")
    public void crearPersona(@RequestBody Person person) {
        personService.crearPersona(person);
    }

    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        personService.borrarPersona(id);
    }
    
    @GetMapping("/persona/{id}")
    public Person obtenerPersona(@PathVariable Long id){
       return personService.obtenerPersona(id);
    }
    
    @PutMapping("/persona")
    public void modificarPersona(@RequestBody Person person){
        personService.modificarPersona(person);
    }
       
}
