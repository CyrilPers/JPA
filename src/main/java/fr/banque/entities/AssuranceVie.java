package fr.banque.entities;

import java.time.LocalDate;
import java.util.Set;

public class AssuranceVie extends Compte{
    double taux;
    LocalDate dateFin;

    public AssuranceVie(String numero, double solde, Set<Client> clients, Set<Operation> operations) {
        super(numero, solde, clients, operations);
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
