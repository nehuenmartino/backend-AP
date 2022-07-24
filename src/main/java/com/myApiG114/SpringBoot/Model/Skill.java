
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
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String skill;
    String img;
    Long idPerson;
    
    public Skill (Long id, String skill,String img, Long idPerson){
    this.id = id;
    this.skill = skill;
    this.img = img;
    this.idPerson = idPerson;
    }
    public Skill(){
    }
}
