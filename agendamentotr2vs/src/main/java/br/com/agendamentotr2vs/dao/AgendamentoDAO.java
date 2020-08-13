package br.com.agendamentotr2vs.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamentotr2vs.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
	
	

}
