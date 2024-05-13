package fr.diginamic.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "TITRE", nullable = false)
    private String titre;

    @Column(name = "AUTEUR", nullable = false, length = 50)
    private String auteur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }
}