
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    long id;
    @Basic
    String usuario;
    String pwd;

    public User() {
    }

    public User(long id, String usuario, String pwd) {
        this.id = id;
        this.usuario = usuario;
        this.pwd = pwd;
    }
    
}
