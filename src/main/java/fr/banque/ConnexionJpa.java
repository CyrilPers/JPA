package fr.banque;

import fr.banque.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ConnexionJpa {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
             EntityManager em = emf.createEntityManager();) {
            em.getTransaction().begin();
            Banque b = new Banque("CE");
            em.persist(b);
            Client client1 = new Client("Dupont", "Pierre");
            em.persist(client1);
            Client client2 = new Client("Dupont", "Jeanne");
            em.persist(client2);
            Set<Client> clients = new HashSet<>();
            clients.add(client1);
            clients.add(client2);
            Compte compte = new Compte(clients, 550000.0, "AZE12009");
            em.persist(compte);
            Client client3 = new Client("Toto", "Titi");
            em.persist(client3);
            Set<Client> clients3 = new HashSet<>();
            clients3.add(client3);
            AssuranceVie assuranceVie = new AssuranceVie(clients3, 10000.0, "ASV01", 5.0, LocalDate.now().plusYears(3));
            em.persist(assuranceVie);
            LivretA livretA = new LivretA(clients3, 10000.0, "ASV01", 10.0);
            em.persist(livretA);
            em.getTransaction().commit();
        }
    }
}
