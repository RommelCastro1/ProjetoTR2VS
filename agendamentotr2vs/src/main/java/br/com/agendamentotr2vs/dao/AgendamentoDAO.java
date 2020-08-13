package br.com.agendamentotr2vs.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.agendamentotr2vs.model.Agencia;
import br.com.agendamentotr2vs.model.Agendamento;


public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
	
	
	public List<Agendamento> findByDataAgendamento (Date dataAgendamento);
	public List<Agendamento> findByNomeCli (String nomeCli);
	public List<Agendamento> findByAgencia (Agencia agencia);
	public List<Agendamento> findByDataAgendamentoAndNomeCli (Date dataAgendamento, String nomeCli);
	public List<Agendamento> findByDataAgendamentoAndAgencia (Date dataAgendamento, Agencia agencia);
	public List<Agendamento> findByAgenciaAndNomeCli ( Agencia agencia, String nomeCli);
	public List<Agendamento> findByDataAgendamentoAndNomeCliAndAgencia (Date dataAgendamento, String nomeCli, Agencia agencia);
	
	
	
	
	
	
	
	
	
}
