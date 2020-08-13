package br.com.agendamentotr2vs.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamentotr2vs.model.Agencia;

public interface AgenciaDAO extends CrudRepository<Agencia, Integer> {

}
