package com.frymce.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String auteur;
    

    // Important: Un constructeur vide pour JPA
    public Livre(){}

    //Notre constructeur pour créer des livres facilement
    public Livre(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }
    //Les getters
    public Long getId(){return id;}
    public String getTitre(){return titre;}
    public String getAuteur(){return auteur;}

    public void setId(Long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}
