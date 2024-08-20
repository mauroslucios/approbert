package br.com.robert.appvendas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.robert.appvendas.entity.Usuario;
import br.com.robert.appvendas.service.UsuarioService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value="api/v1")
@CrossOrigin(origins="*")
@AllArgsConstructor
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value="/usuarios", produces="application/json")
	public ResponseEntity<List<Usuario>> buscarTodosUsuarios(){
		List<Usuario> listUsuarios = usuarioService.buscarTodosUsuarios();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		for(Usuario usuario : listUsuarios) {
			//Long id = usuario.getId();
			usuarios.add(usuario);
		}
		return ResponseEntity.ok().body(usuarios);
	}
}
