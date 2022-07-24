
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
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String email;
    String github;
    String linkedin;
    String codepen;
    String instagram;
    Long idPerson;

    public SocialMedia(Long id, String email, String github, String linkedin, String codepen, String instagram, Long idPerson) {
        this.id = id;
        this.email = email;
        this.github = github;
        this.linkedin = linkedin;
        this.codepen = codepen;
        this.instagram = instagram;
        this.idPerson = idPerson;
    }

    public SocialMedia() {
    }
    
}
