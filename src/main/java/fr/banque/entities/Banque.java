package fr.banque.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    String nom;

    @OneToMany(mappedBy = "banque")
    private Set<Client> clients;

    public Banque(String nom) {
        this.nom = nom;
    }

    public Banque() {

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

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Banque(String nom, Set<Client> clients) {
        this.nom = nom;
        this.clients = clients;
    }
}
