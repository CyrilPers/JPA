package fr.diginamic;

import fr.diginamic.entities.Client;
import fr.diginamic.entities.Emprunt;
import fr.diginamic.entities.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class ConnexionJpa {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
             EntityManager em = emf.createEntityManager();) {
            System.out.println(em);
            em.getTransaction().begin();
//            Livre livre = em.find(Livre.class, 1);
//            Livre livre1 = new Livre("Test titre", "test auteur");
//            em.persist(livre1);
            Emprunt emprunt = em.find(Emprunt.class, 1);
            if (emprunt != null) {
                ArrayList<Livre> livresEmpruntId1 = new ArrayList<>(emprunt.getLivres());
                System.out.println(livresEmpruntId1);
                if (livresEmpruntId1.size() > 0) {
                    livresEmpruntId1.forEach(livre -> System.out.println(livre.toString()));
                }

            }
            Client client = em.find(Client.class, 1);
            if (client != null) {
                ArrayList<Emprunt> empruntsClient = new ArrayList<>(client.getEmprunts());
                if (empruntsClient.size() > 0) {
                empruntsClient.forEach(emp -> System.out.println(emp.toString()));
                }
            }
            em.getTransaction().commit();
        }

    }
}
