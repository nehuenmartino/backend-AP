
package com.myApiG114.SpringBoot.Service;

import com.myApiG114.SpringBoot.Model.Person;
import java.util.List;

public interface IPersonService {
    public void crearPersona(Person person);
    public void borrarPersona(Long id);
    public List<Person> listarPersonas();
}
