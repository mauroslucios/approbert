package br.com.robert.appvendas.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.robert.appvendas.entity.Usuario;
import lombok.Getter;

@Getter
public class UsuarioDto {
	
	private Long id;
	private String nome;
	private String email;
	
	
	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		
	}
	
	public static List<UsuarioDto> converter(List<Usuario> list) {
		return list.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
