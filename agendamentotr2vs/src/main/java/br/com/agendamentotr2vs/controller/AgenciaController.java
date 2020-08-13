package br.com.agendamentotr2vs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamentotr2vs.dao.AgenciaDAO;
import br.com.agendamentotr2vs.model.Agencia;


@RestController //Para que a classe responda aos protocolos HTTP
@CrossOrigin("*")
public class AgenciaController {
	
	
	@Autowired
	private AgenciaDAO adao; 
	
	
	
	@GetMapping ("/agencias")
	public ResponseEntity< List<Agencia> > retornarAgencias(){
		
		ArrayList<Agencia> lista = (ArrayList<Agencia>) adao.findAll();
		
		if (lista.size()==0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(lista) ;
		
	}
	
	

}
