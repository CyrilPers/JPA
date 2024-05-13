package fr.diginamic.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "DATE_DEBUT", nullable = false)
    private Instant dateDebut;

    @Column(name = "DATE_FIN")
    private Instant dateFin;

    @Column(name = "DELAI")
    private Integer delai;

    @Column(name = "ID_CLIENT", nullable = false)
    private Integer idClient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Instant dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Instant getDateFin() {
        return dateFin;
    }

    public void setDateFin(Instant dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getDelai() {
        return delai;
    }

    public void setDelai(Integer delai) {
        this.delai = delai;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

}