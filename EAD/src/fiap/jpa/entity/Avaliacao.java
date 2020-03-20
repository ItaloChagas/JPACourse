package fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import fiap.jpa.entity.composedPk.AvaliacaoId;

@Table(name ="tb_avaliacao")
@Entity
public class Avaliacao implements Serializable {

	@EmbeddedId
	private AvaliacaoId id;
	
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Cliente cliente;
	
	@JoinColumn(name ="id_estabelecimento", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Estabelecimento estabelecimento;
	
	@Column(name = "nota_avaliacao")
	private int nota;
	
	@CreationTimestamp()
	@Column(name = "dh_avaliacao")
	private Calendar dataAvaliacao;

	
	
	
	
	
	
	
	
	
	
	
	
	public AvaliacaoId getId() {
		return id;
	}

	public void setId(AvaliacaoId id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Calendar getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(Calendar dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}
	
	
	
	
	
	
	
	
}
