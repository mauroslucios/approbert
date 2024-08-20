package br.com.robert.appvendas.entity;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import br.com.robert.appvendas.enums.UsuarioRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name="tb_usuario")
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Usuario extends RepresentationModel<Usuario> implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max = 80, message = "O nome pode ter no máximo 80 caracteres.")
	@Size(min = 3, message="O nome deve ter no mínimo 3 caracteres.")
	@NotBlank
	private String nome;
	
	@Column(unique = true)
	@Email(message = "O campo deve ser um email válido.")
	@Size(max=80, message="Email deve ter no máximo 80 caracteres.")
	private String email;
	
	@NotBlank
	@Column(unique=true)
	private String senha;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	UsuarioRole role;
	
	public Usuario() {
		
	}



}
