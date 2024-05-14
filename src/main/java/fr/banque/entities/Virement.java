package fr.banque.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Virement extends Operation {
    @Column(name="BENEFICIARE")
    String beneficiaire;

    public Virement(LocalDateTime date, double montant, String motif, Compte compte, String beneficiaire) {
        super(date, montant, motif, compte);
        this.beneficiaire = beneficiaire;
    }

    public Virement() {
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}

