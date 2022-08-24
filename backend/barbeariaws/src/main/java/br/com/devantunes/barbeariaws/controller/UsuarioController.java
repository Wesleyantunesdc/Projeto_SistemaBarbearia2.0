package br.com.devantunes.barbeariaws.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devantunes.barbeariaws.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1l, "wesley", "wesley", "123221das", Boolean.TRUE);
		return ResponseEntity.ok().body(u);
	}
	
}
