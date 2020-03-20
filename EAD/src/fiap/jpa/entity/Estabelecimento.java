package fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="tb_estabelecimento")
public class Estabelecimento {

	@Id
	@Column(name="id_estabelecimento")
	@SequenceGenerator(name = "estabelecimento", sequenceName = "seq_estabelecimento")
	@GeneratedValue(generator = "estabelecimento", strategy = GenerationType.SEQUENCE)
	private int id; 
	

	@Column(name = "nm_estabelecimento")
	private String nome;
	
	@OneToOne(mappedBy = "estabelecimento" )
	private Contrato contrato; 
	

	@ManyToOne
	@JoinColumn(name = "id_tipo_estabelecimento")
	private TipoEstabelecimento tipo;

	
	public Estabelecimento(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
		

	public Estabelecimento(String nome) {
		super();
		this.nome = nome;
	}


	public Estabelecimento() {
		super();
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

	
}
