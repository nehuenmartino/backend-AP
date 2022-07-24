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
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String job;
    String img;
    String description;
    String periodo;
    Long idPerson;

    public Experience(Long id, String job,String img, String description,  String periodo, Long idPerson) {
        this.id = id;
        this.job = job;
        this.img = img;
        this.description = description;        
        this.periodo = periodo;
        this.idPerson = idPerson;
    }

    public Experience() {
    }
    

}