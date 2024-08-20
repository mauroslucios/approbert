package br.com.robert.appvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.robert.appvendas.entity.Usuario;
import br.com.robert.appvendas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> buscarTodosUsuarios(){
		return usuarioRepository.findAll();
	}
}
