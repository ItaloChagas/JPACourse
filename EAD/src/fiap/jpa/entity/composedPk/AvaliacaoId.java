package fiap.jpa.entity.composedPk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AvaliacaoId  implements Serializable{

	@Column(name ="id_estabelecimento")
	private int idEstablecimento;
	
	@Column(name ="id_cliente")
	private int idCliente;

	
	
	
	
	public AvaliacaoId() {
		super();
	}

	public AvaliacaoId(int idEstablecimento, int idCliente) {
		super();
		this.idEstablecimento = idEstablecimento;
		this.idCliente = idCliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCliente;
		result = prime * result + idEstablecimento;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliacaoId other = (AvaliacaoId) obj;
		if (idCliente != other.idCliente)
			return false;
		if (idEstablecimento != other.idEstablecimento)
			return false;
		return true;
	}

	public int getIdEstablecimento() {
		return idEstablecimento;
	}

	public void setIdEstablecimento(int idEstablecimento) {
		this.idEstablecimento = idEstablecimento;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
}
