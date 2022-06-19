package com.example.proyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user", schema = "usuario")
public class User {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "mail")
    private String mail;

    @Column(name = "comentario")
    private String comentario;

    public User() {
    }

    public User(String name, String mail, String comentario) {
        this.name = name;
        this.mail = mail;
        this.comentario = comentario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
