package fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="tb_contrato")
public class Contrato {

	@Id
	@SequenceGenerator(sequenceName = "seq_contrato", allocationSize = 1, name = "contrato")
	@GeneratedValue(generator = "contrato", strategy = GenerationType.SEQUENCE)
	@Column(name ="id_contrato")
	private int id;
	
	@Column(name ="vl_aluguel", nullable = false )
	private float aluguel; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="dt_vencimento_aluguel")
	private Calendar dataVencimento;

	@OneToOne
	@JoinColumn(name= "id_estabelecimento")
	private Estabelecimento estabelecimento;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAluguel() {
		return aluguel;
	}

	public void setAluguel(float aluguel) {
		this.aluguel = aluguel;
	}

	public Contrato() {
		super();
	}

	public Contrato(int id, float aluguel, Calendar dataVencimento) {
		super();
		this.id = id;
		this.aluguel = aluguel;
		this.dataVencimento = dataVencimento;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
}