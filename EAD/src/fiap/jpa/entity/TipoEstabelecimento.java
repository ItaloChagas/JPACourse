package fiap.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_tipo_estabelecimento")
public class TipoEstabelecimento {

	@Id
	@SequenceGenerator(name = "tipoEstabelecimento", sequenceName = "seq_tipo_estabelecimento", initialValue = 1)
	@GeneratedValue(generator = "tipoEstabelecimento", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_tipo_estabelecimento")
	private int id;
	
	@Column(name = "nm_estabelecimento")
	private String nome;
	
	@OneToMany(mappedBy = "tipo")
	private List<Estabelecimento> estabelecimentos;
	
	

	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
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

	public TipoEstabelecimento(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public TipoEstabelecimento() {
		super();
	}
	
	
	
}
