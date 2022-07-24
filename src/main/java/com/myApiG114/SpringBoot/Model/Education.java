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
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String school;
    String title;
    String img;
    String periodo;
    Long idPerson;

    public Education(Long id, String school, String title, String img, String periodo, Long idPerson) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.img = img;
        this.periodo = periodo;
        this.idPerson = idPerson;
    }

    public Education() {
    }
    

}
