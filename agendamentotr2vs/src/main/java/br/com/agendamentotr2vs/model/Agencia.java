package br.com.agendamentotr2vs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TB_AGENCIA")
public class Agencia {
	
	@Column(name = "id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome_agencia", length = 100 )
	private String nome_agencia;
	
	
	@Column(name="hora_inicio")
	private int hora_inicio;
	
	
	@Column(name="hora_fim")
	private int hora_fim;

	
	
	
	
	
	
	
	
	public Agencia() {
		super();
	}









	public Agencia(int id, String nome_agencia, int hora_inicio, int hora_fim) {
		super();
		this.id = id;
		this.nome_agencia = nome_agencia;
		this.hora_inicio = hora_inicio;
		this.hora_fim = hora_fim;
	}









	public int getId() {
		return id;
	}









	public void setId(int id) {
		this.id = id;
	}









	public String getNome_agencia() {
		return nome_agencia;
	}









	public void setNome_agencia(String nome_agencia) {
		this.nome_agencia = nome_agencia;
	}









	public int getHora_inicio() {
		return hora_inicio;
	}









	public void setHora_inicio(int hora_inicio) {
		this.hora_inicio = hora_inicio;
	}









	public int getHora_fim() {
		return hora_fim;
	}









	public void setHora_fim(int hora_fim) {
		this.hora_fim = hora_fim;
	}

	
	
	
	
	
	
	
	

}
