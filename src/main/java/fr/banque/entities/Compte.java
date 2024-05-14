package fr.banque.entities;

import fr.diginamic.entities.Livre;
import jakarta.persistence.*;

import java.util.Set;

public abstract class Compte {
    @Id
    @Column(nullable = false)
    String numero;
    double solde;
    @ManyToMany
    @JoinTable(name = "COMPO",
            joinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "numero"),
            inverseJoinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "id")
    )
    private Set<Client> clients;
    @OneToMany(mappedBy = "compte")
    Set<Operation> operations;


    public Compte(String numero, double solde, Set<Client> clients, Set<Operation> operations) {
        this.numero = numero;
        this.solde = solde;
        this.clients = clients;
        this.operations = operations;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }
}
