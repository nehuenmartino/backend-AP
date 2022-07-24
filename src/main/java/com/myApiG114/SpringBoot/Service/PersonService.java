package com.myApiG114.SpringBoot.Service;

import com.myApiG114.SpringBoot.Model.Person;
import com.myApiG114.SpringBoot.Repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {

@Autowired
PersonRepository personRepository;
    @Override
    public void crearPersona(Person person) {
        personRepository.save(person);
    }

    @Override
    public void borrarPersona(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> listarPersonas() {
        return personRepository.findAll();
    }
    
    public Person obtenerPersona(Long id){
        return personRepository.findById(id).orElse(null);
    }
    
    public void modificarPersona(Person person){
    personRepository.save(person);
    }

}
