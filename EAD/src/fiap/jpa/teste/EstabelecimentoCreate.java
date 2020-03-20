package fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fiap.jpa.entity.Avaliacao;
import fiap.jpa.entity.Cliente;
import fiap.jpa.entity.Estabelecimento;
import fiap.jpa.entity.composedPk.AvaliacaoId;

public class EstabelecimentoCreate {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = fabrica.createEntityManager();
		
		
		
				
		try {
		
			Estabelecimento estabelecimento = new Estabelecimento("mcDonlad");
			
			
			em.persist(estabelecimento);
		
			
			em.getTransaction().begin();
			em.getTransaction().commit();
			
			System.out.println("Avaliacao persistida com sucesso");
		} catch (Exception e) {
			if(em.getTransaction().isActive()) em.getTransaction().rollback();
			
			System.out.println("Nao foi possivel persistir nova avaliacao");
		}
		
		
		em.close();
		fabrica.close();
		
	}

}
