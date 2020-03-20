package fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name= "tb_cliente")
@Entity(name = "cliente")
public class Cliente {

	@Id
	@Column(name="id_cliente")
	@SequenceGenerator(name = "cliente", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "cliente", strategy = GenerationType.SEQUENCE)
	private int id;
	
	
	public Cliente() {
		super();
	}

	public Cliente(String nome) {
		super();
	
		this.nome = nome;
	}
	
	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name="nm_cliente", length = 100, nullable = false)
	private String nome;
	
}
