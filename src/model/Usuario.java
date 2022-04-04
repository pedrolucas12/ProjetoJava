package model;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

	// Atributos Usuario
	private int cpf;
	private int telefone;
	private String nome;
	private String endereco;
	private String email;
	// private Date nascimento;

	// Construtor

	public Usuario(String n, int c, int t, String e, String em) {
		this.nome = n;
		this.cpf = c;
		this.telefone = t;
		this.endereco = e;
		this.email = em;
		;

	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// public Date getNascimento() {
	// return nascimento;
	// }

	// public void setNascimento(Date nascimento) {
	// this.nascimento = nascimento;
	// }

}
