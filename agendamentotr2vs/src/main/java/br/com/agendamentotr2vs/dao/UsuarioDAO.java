package br.com.agendamentotr2vs.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamentotr2vs.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	
	public Usuario findByRacfAndSenha (String racf, String senha);
	public Usuario findByFuncionalAndSenha (String funcional, String senha);
	

}
