package br.com.robert.appvendas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UsuarioRole {

	ADMINISTRADOR("Administrador"),
	PADRAO("Padrao");
	
	UsuarioRole(String string){
		
	}
}
