package fr.banque.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    String nom;
    String prenom;
    LocalDate dateNaissance;

    @JoinTable(name = "COMPO",
            joinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "numero")
    )
    private Set<Compte> comptes;

    @ManyToOne
    @JoinColumn(name="ID_BANQUE")
    Banque banque;

    @Embedded
    private Adresse adresse;

    public Client(String nom, String prenom, LocalDate dateNaissance, Set<Compte> comptes, Banque banque, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.comptes = comptes;
        this.banque = banque;
        this.adresse = adresse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


    public Set<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
