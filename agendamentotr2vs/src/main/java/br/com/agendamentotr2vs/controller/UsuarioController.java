package br.com.agendamentotr2vs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agendamentotr2vs.dao.UsuarioDAO;
import br.com.agendamentotr2vs.model.Usuario;

@RestController //Para que a classe responda aos protocolos HTTP
@CrossOrigin("*")
public class UsuarioController {
	
	
	@Autowired
	private UsuarioDAO udao;  
	

	//Tratar se é fnconal ou racf no frontEnd
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario usuario){
		
		
		Usuario objeto = null;
				
		if (usuario.getFuncional() == null) {
			
		 objeto = udao.findByRacfAndSenha(usuario.getRacf(), usuario.getSenha());
			
		}else if(usuario.getRacf() == null) {
		
		 objeto = udao.findByFuncionalAndSenha(usuario.getFuncional(), usuario.getSenha());
		
		}
		
		
		if (objeto==null) {
		return ResponseEntity.notFound().build();
		}
	
		return ResponseEntity.ok(objeto) ;
	}
	
}
