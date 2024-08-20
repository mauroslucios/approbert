package br.com.robert.appvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.robert.appvendas.dto.UsuarioDto;
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
	
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<UsuarioDto>> findAll(){
		List<UsuarioDto> list = usuarioService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/users/{id}")
	public Usuario findOne(@PathVariable(value="id") Long id){
		Usuario result = usuarioService.findById(id);
		return result;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/usuarios")
	public Usuario insertUser(@RequestBody Usuario usuario) {
		return usuarioService.insertUser(usuario);
	}
	
	
	@PutMapping("/usuarios")
	public Usuario updateProduto(@RequestBody Usuario usuario) {
		return usuarioService.updateUser(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void deleteUser(@PathVariable Long id) {
		usuarioService.deleteUser(id);
	}

}
