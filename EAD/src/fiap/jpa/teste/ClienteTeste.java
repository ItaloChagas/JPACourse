package fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fiap.jpa.entity.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = fabrica.createEntityManager();
		
			Cliente cliente = em.find(Cliente.class, 1);									 
			System.out.println("Cliente " + cliente.getNome() + " encontrado na base de dados");				
	}

}
