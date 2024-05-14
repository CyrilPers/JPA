package fr.banque.entities;

import java.util.Set;

public class LivretA extends Compte {
    double taux;

    public LivretA(String numero, double solde, Set<Client> clients, Set<Operation> operations, double taux) {
        super(numero, solde, clients, operations);
        this.taux = taux;
    }
}
