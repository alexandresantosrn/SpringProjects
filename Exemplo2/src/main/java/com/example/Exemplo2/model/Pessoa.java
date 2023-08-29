package com.example.Exemplo2.model;

public class Pessoa extends AbsctractPessoa {

	private String cpf;

	public Pessoa(String nome, String endereco, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	@Override
	public String getTipoPessoa() {
		// TODO Auto-generated method stub
		return "Pessoa Física";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

 }
