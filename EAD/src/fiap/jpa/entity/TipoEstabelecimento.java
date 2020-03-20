package fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_tipo_estabelecimento")
public class TipoEstabelecimento {

	@Id
	@SequenceGenerator(name = "tipoEstabelecimento", sequenceName = "seq_tipo_estabelecimento", initialValue = 1)
	@Column(name = "id_tipo_estabelecimento")
	private int id;
	
	@Column(name = "nm_estabelecimento")
	private String nome;
	
}
