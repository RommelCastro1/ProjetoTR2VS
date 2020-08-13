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
	private String nomeCli;
	
	@Column(name = "email_cli", length = 100 )
	private String emailCli;
	
	@Column(name = "celular_cli", length = 20 )
	private String celularCli;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	@Column(name="data_agendamento")
	@Temporal(TemporalType.DATE)
	private Date dataAgendamento; 
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="hh:mm")
	@Column(name="hora_agendamento")
	@Temporal(TemporalType.TIME)
	private Date horaAgendamento;
	
	@Column(name = "obs", length = 255 )
	private String obs;
	
	@JsonIgnoreProperties("id_agencia")
	@ManyToOne
	private Agencia agencia;

	
	
	
	
	
	public Agendamento() {
		super();
	}






	public Agendamento(int numSeq, String nomeCli, String emailCli, String celularCli, Date dataAgendamento,
			Date horaAgendamento, String obs, Agencia agencia) {
		super();
		this.numSeq = numSeq;
		this.nomeCli = nomeCli;
		this.emailCli = emailCli;
		this.celularCli = celularCli;
		this.dataAgendamento = dataAgendamento;
		this.horaAgendamento = horaAgendamento;
		this.obs = obs;
		this.agencia = agencia;
	}






	public int getNumSeq() {
		return numSeq;
	}






	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}






	public String getNomeCli() {
		return nomeCli;
	}






	public void setNomeCli(String nomeCli) {
		this.nomeCli = nomeCli;
	}






	public String getEmailCli() {
		return emailCli;
	}






	public void setEmailCli(String emailCli) {
		this.emailCli = emailCli;
	}






	public String getCelularCli() {
		return celularCli;
	}






	public void setCelularCli(String celularCli) {
		this.celularCli = celularCli;
	}






	public Date getDataAgendamento() {
		return dataAgendamento;
	}






	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}






	public Date getHoraAgendamento() {
		return horaAgendamento;
	}






	public void setHoraAgendamento(Date horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
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
