
package com.myApiG114.SpringBoot.Repository;

import com.myApiG114.SpringBoot.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {    
}
