package fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fiap.jpa.entity.Avaliacao;
import fiap.jpa.entity.Cliente;
import fiap.jpa.entity.Estabelecimento;
import fiap.jpa.entity.composedPk.AvaliacaoId;

public class AvaliacaoCreate {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = fabrica.createEntityManager();
		
		Estabelecimento estabelecimento = new Estabelecimento("McDonalds");
		Cliente cliente = new Cliente("Italo");
				
		try {
			
			em.persist(estabelecimento);
			em.persist(cliente);
			
			AvaliacaoId idNovo = new AvaliacaoId();
			idNovo.setIdCliente(cliente.getId());
			idNovo.setIdEstablecimento(estabelecimento.getId());
			
			Avaliacao avaliacao = new Avaliacao();
			avaliacao.setId(idNovo);
			
			em.persist(avaliacao);
			
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
