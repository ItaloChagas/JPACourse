package fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fiap.jpa.entity.Cliente;

public class ClienteTeste2 {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = fabrica.createEntityManager();
		
		
		Cliente cliente = new Cliente(1, "italo");
		
		try{ 
			em.remove(cliente);
			em.getTransaction().begin();
			em.getTransaction().commit();
			
		}catch (Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			
			System.out.println("Cliente removido");
		}
				
	}

}
