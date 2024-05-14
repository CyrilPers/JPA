package fr.banque.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    private LocalDate date;
    private double montant;
    private String motif;

    @ManyToOne
    @JoinColumn(name="id_operation")
    private Compte compte;

    public Operation(LocalDate date, double montant, String motif, Compte compte) {
        this.date = date;
        this.montant = montant;
        this.motif = motif;
        this.compte = compte;
    }

    public Operation() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
}
