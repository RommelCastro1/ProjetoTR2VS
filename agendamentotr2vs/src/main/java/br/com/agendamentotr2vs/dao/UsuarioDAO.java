package br.com.agendamentotr2vs.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamentotr2vs.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	

}
