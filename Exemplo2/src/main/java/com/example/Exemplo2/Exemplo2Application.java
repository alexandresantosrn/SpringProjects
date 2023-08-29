package com.example.Exemplo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Exemplo2.model.Papel;
import com.example.Exemplo2.model.Pessoa;
import com.example.Exemplo2.model.Usuario;

@SpringBootApplication
public class Exemplo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo2Application.class, args);
		
		Papel papel1 = new Papel("Gestor");
		Papel papel2 = new Papel("Secretario");
		
		Pessoa pessoa = new Pessoa("Alexandre Dantas", "Rua dos Canindés", "05641479403");
		
		Usuario user = new Usuario("allexkid@hotmail.com", "123456", pessoa);
		
		user.adicionarPapeis(papel1, user);
		user.adicionarPapeis(papel2, user);
		
		System.out.println("Usuário: " + pessoa.getNome());
		System.out.println("Papeis:" + user.getPapeis().toString());
	}

}
