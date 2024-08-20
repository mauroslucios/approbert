package br.com.robert.appvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.robert.appvendas.dto.UsuarioDto;
import br.com.robert.appvendas.entity.Usuario;
import br.com.robert.appvendas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioDto> findAll() {
		List<Usuario> list = usuarioRepository.findAll();
		return UsuarioDto.converter(list);
	}

	public Usuario findById(Long id) {
		return usuarioRepository.findById(id).get();
	}

	public Usuario insertUser(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario updateUser(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public void deleteUser(Long id) {
		usuarioRepository.deleteById(id);
	}
}
