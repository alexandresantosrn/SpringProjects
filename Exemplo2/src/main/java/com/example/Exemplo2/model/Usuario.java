package com.example.Exemplo2.model;

import java.util.Collection;
import java.util.HashSet;

public class Usuario {

	private String email;
	private String senha;
	Pessoa pessoa;
	private Collection<Papel> papeis = new HashSet<>();

	public Usuario(String email, String senha, Pessoa pessoa) {
		super();
		this.email = email;
		this.senha = senha;
		this.pessoa = pessoa;		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Collection<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(Collection<Papel> papeis) {
		this.papeis = papeis;
	}
	
	public void adicionarPapeis(Papel papel, Usuario usuario) {
		papeis.add(papel);
	}
}
