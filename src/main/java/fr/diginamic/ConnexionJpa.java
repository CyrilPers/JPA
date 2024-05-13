package fr.diginamic;

import fr.diginamic.entities.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
            EntityManager em = emf.createEntityManager();) {
            System.out.println(em);

            Livre livre = em.find(Livre.class, 1);
            System.out.println(livre.toString());
        }
    }
}
