
package com.myApiG114.SpringBoot.Model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    long id;
    @Basic
    String fullName;
    String position;
    String description;
    String image;

    public Person() {
    }

    public Person(long id, String fullName, String position, String description, String image) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.description = description;
        this.image = image;
    }
    
}
