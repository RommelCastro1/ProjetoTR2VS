package br.com.agendamentotr2vs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_AGENDAMENTO")
public class Agendamento {
	
	@Column(name = "num_seq" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numSeq;
	
	
	@Column(name = "nome_cli", length = 100 )
	private String nome_cli;
	
	@Column(name = "email_cli", length = 100 )
	private String email_cli;
	
	@Column(name = "celular_cli", length = 20 )
	private String celular_cli;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	@Column(name="data_agendamento")
	@Temporal(TemporalType.DATE)
	private Date data_agendamento; 
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="hh:mm")
	@Column(name="hora_agendamento")
	@Temporal(TemporalType.TIME)
	private Date hora_agendamento;
	
	@Column(name = "obs", length = 255 )
	private String obs;
	
	@JsonIgnoreProperties("id_agencia")
	@ManyToOne
	private Agencia agencia;

	
	
	
	
	
	public Agendamento() {
		super();
	}

	
	
	public Agendamento(int numSeq, String nome_cli, String email_cli, String celular_cli, Date data_agendamento,
			Date hora_agendamento, String obs, Agencia agencia) {
		super();
		this.numSeq = numSeq;
		this.nome_cli = nome_cli;
		this.email_cli = email_cli;
		this.celular_cli = celular_cli;
		this.data_agendamento = data_agendamento;
		this.hora_agendamento = hora_agendamento;
		this.obs = obs;
		this.agencia = agencia;
	}

	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}

	public String getNome_cli() {
		return nome_cli;
	}

	public void setNome_cli(String nome_cli) {
		this.nome_cli = nome_cli;
	}

	public String getEmail_cli() {
		return email_cli;
	}

	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}

	public String getCelular_cli() {
		return celular_cli;
	}

	public void setCelular_cli(String celular_cli) {
		this.celular_cli = celular_cli;
	}

	public Date getData_agendamento() {
		return data_agendamento;
	}

	public void setData_agendamento(Date data_agendamento) {
		this.data_agendamento = data_agendamento;
	}

	public Date getHora_agendamento() {
		return hora_agendamento;
	}

	public void setHora_agendamento(Date hora_agendamento) {
		this.hora_agendamento = hora_agendamento;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
	
	
	
	
	
	
	
	
	

}
