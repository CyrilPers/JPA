package fr.banque.entities;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPTE")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NUM")
    private String numero;
    @Column(name = "SOLDE")
    private double solde;
    @OneToMany(mappedBy = "compte")
    private Set<Operation> operations;
    @ManyToMany(mappedBy = "comptes")
    private Set<Client> clients;

    public Compte() {
        super();
    }

    public Compte(Set<Client> clients, double solde, String numero) {
        this.clients = clients;
        this.solde = solde;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + "]";
    }

}