package fr.banque.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Set;

@Entity
public class LivretA extends Compte {
    @Column(name = "TAUX")
    private double taux;

    public LivretA(Set<Client> clients, double solde, String numero, double taux) {
        super(clients, solde, numero);
        this.taux = taux;
    }

    public LivretA() {

    }
}
