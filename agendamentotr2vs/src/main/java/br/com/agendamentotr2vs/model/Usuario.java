package br.com.agendamentotr2vs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	
	
	@Column(name = "id" )
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "funcional", length = 9 )
	private String fucional; 
	
	@Column(name = "nome", length = 100 )
	private String nome;
	
	@Column(name = "racf", length = 10 )
	private String racf;
	
	@Column(name = "senha", length = 20 )
	private String senha;
	
	
	
	
	
	
	
	public Usuario() {
		super();
	}
	
	
	
	public Usuario(int id, String fucional, String nome, String racf, String senha) {
		super();
		this.id = id;
		this.fucional = fucional;
		this.nome = nome;
		this.racf = racf;
		this.senha = senha;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFucional() {
		return fucional;
	}
	public void setFucional(String fucional) {
		this.fucional = fucional;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRacf() {
		return racf;
	}
	public void setRacf(String racf) {
		this.racf = racf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	

}
