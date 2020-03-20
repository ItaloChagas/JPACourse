package fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fiap.jpa.entity.Cliente;

public class dddd {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		
		Cliente cliente = new Cliente("italo");
		
		try{ 
			em.persist(cliente);
			em.getTransaction().begin();
			em.getTransaction().commit();
			
		}catch (Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			
			System.out.println("Cliente cadastrado");
		}
				
	
	}

}
