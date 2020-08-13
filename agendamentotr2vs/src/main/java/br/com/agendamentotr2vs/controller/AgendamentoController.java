package br.com.agendamentotr2vs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamentotr2vs.dao.AgendamentoDAO;
import br.com.agendamentotr2vs.model.Agendamento;


@RestController //Para que a classe responda aos protocolos HTTP
@CrossOrigin("*")
public class AgendamentoController {
	
	
	@Autowired
	private AgendamentoDAO agdao;  
	
	
	@PostMapping("/agendamento")
	public ResponseEntity<List<Agendamento>> pesquisaAgendamentos(@RequestBody Agendamento agendamento){
		
		ArrayList<Agendamento> objeto = null;
		
		
		if (agendamento.getDataAgendamento()== null && agendamento.getAgencia()== null && agendamento.getNomeCli()==null) {
			
		objeto = (ArrayList<Agendamento>) agdao.findAll() ;
		
		
		}else if (agendamento.getDataAgendamento()== null && agendamento.getAgencia()== null) {
			
			objeto = (ArrayList<Agendamento>) agdao.findByNomeCli(agendamento.getNomeCli());
			
			
		}else if(agendamento.getAgencia()== null && agendamento.getNomeCli()==null ) {
			
			objeto = (ArrayList<Agendamento>) agdao.findByDataAgendamento(agendamento.getDataAgendamento());
			
			
		}else if(agendamento.getDataAgendamento()== null && agendamento.getNomeCli()==null) {
			
			objeto = (ArrayList<Agendamento>) agdao.findByAgencia(agendamento.getAgencia());
			
		}else if (agendamento.getDataAgendamento()== null) {
			
			objeto = (ArrayList<Agendamento>) agdao.findByAgenciaAndNomeCli(agendamento.getAgencia(), agendamento.getNomeCli());
		
		}else if (agendamento.getNomeCli()==null) {
			
			objeto = (ArrayList<Agendamento>) agdao.findByDataAgendamentoAndAgencia(agendamento.getDataAgendamento(), agendamento.getAgencia());
		
		}else if (agendamento.getAgencia()== null) {
			
			objeto = (ArrayList<Agendamento>) agdao.findByDataAgendamentoAndNomeCli(agendamento.getDataAgendamento(), agendamento.getNomeCli());
		
		}else {
			
			objeto = (ArrayList<Agendamento>) agdao.findByDataAgendamentoAndNomeCliAndAgencia(agendamento.getDataAgendamento(), 
					agendamento.getNomeCli(), agendamento.getAgencia());
			
		}
		
		
		
		
		if (objeto.size()==0) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(objeto) ;

	}

	@PostMapping("/agendamento/data")
	public ResponseEntity<List<Agendamento>> pesquisaAgendamentosDoDia(@RequestBody Agendamento agendamento){
		
	ArrayList<Agendamento> objeto = (ArrayList<Agendamento>) agdao.findByDataAgendamento(agendamento.getDataAgendamento()) ;
	
	if (objeto.size()==0) {
		return ResponseEntity.notFound().build();
	}
	
	return ResponseEntity.ok(objeto) ;
	
	}
	
	
	
	@PostMapping("/novoAgendamento")
	public ResponseEntity<Agendamento> novoAgendamento  (@RequestBody Agendamento agendamento){
		
		
		try {
		Agendamento objeto =  agdao.save(agendamento);
			
		return ResponseEntity.ok(objeto) ;
		}catch(Exception e) {
			return ResponseEntity.status(404).build();
			
		}
	}
	
	

}
