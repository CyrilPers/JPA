package fr.banque;

import fr.banque.entities.Banque;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
             EntityManager em = emf.createEntityManager();) {
            em.getTransaction().begin();
            Banque b = new Banque("CE");
            em.persist(b);
            em.getTransaction().commit();
        }
    }
}
