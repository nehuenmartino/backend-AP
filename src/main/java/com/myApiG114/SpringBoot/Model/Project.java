
package com.myApiG114.SpringBoot.Model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String title;
    String img;
    String description;
    String date;
    String link;
    Long idPerson;

    public Project(Long id, String title, String img, String description, String date, String link, Long idPerson) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.description = description;
        this.date = date;
        this.link = link;
        this.idPerson = idPerson;
    }

    public Project() {
    }
    

}
