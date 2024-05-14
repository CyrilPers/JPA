package fr.banque.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public abstract class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numero", nullable = false)
    private String numero;
    private double solde;

    @ManyToMany
    @JoinTable(name = "COMPO",
            joinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "numero"),
            inverseJoinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID")
    )
    private Set<Client> clients;
    @OneToMany(mappedBy = "compte")
    private Set<Operation> operations;


    public Compte(String numero, double solde, Set<Client> clients, Set<Operation> operations) {
        this.numero = numero;
        this.solde = solde;
        this.clients = clients;
        this.operations = operations;
    }

    public Compte() {

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
