package fr.banque.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class AssuranceVie extends Compte{
    @Column(name = "TAUX")
    private double taux;
    @Column(name="DATE_FIN")
    private LocalDate dateFin;


    public AssuranceVie(Set<Client> clients, double solde, String numero, double taux, LocalDate dateFin) {
        super(clients, solde, numero);
        this.taux = taux;
        this.dateFin = dateFin;
    }

    public AssuranceVie() {

    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}
