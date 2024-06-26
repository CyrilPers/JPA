package fr.diginamic.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "DATE_DEBUT", nullable = false)
    private LocalDate dateDebut;

    @Column(name = "DATE_FIN")
    private LocalDate dateFin;

    @Column(name = "DELAI")
    private Integer delai;


    @ManyToMany
    @JoinTable(name = "COMPO",
            joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID")
    )
    private Set<Livre> livres;

    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;

    public Emprunt() {

    }

    public Emprunt(LocalDate dateDebut, LocalDate dateFin, Integer delai, Set<Livre> livres, Client client) {
        super();
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
        this.livres = livres;
        this.client = client;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getDelai() {
        return delai;
    }

    public void setDelai(Integer delai) {
        this.delai = delai;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Emprunt [id = " + id + ", date_debut = " + dateDebut +  " , date_fin = " + dateFin + " ] ";
    }
}