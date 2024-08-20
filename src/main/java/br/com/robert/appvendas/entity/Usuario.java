package br.com.robert.appvendas.entity;

import java.io.Serializable;
import org.springframework.hateoas.RepresentationModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	
	
	private String nome;
	
	public Usuario() {
		
	}



}
