package model;

import java.util.ArrayList;
import java.util.Date;

/** 
	 * @return Define o que e o usuario
	 */
public class Usuario {

	// Atributos Usuario
	private String cpf;
	private String telefone;
	private String nome;
	private String endereco;
	private String email;
	// private Date nascimento;

	// Construtor
/** 
	 * @return Metodo Construtor
	 */
	public Usuario(String n, String c, String t, String e, String em) {
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

	
	/** 
	 * @return funcao para retornar o nome
	 */
	public String toString() {
		return nome;
	}

	
	/** 
	 * @return funcao para saber o que e o cpf
	 */
	public String  getCpf() {
		return cpf;
	}

	
	/** 
	 * @param define o que e o CPF
	 */
	public void setCpf(String  cpf) {
		this.cpf = cpf;
	}

	
	/** 
	 * @return funcao para saber o que e o telefone
	 */
	public String  getTelefone() {
		return telefone;
	}

	
	/** 
	 * @param define o que e o telefone
	 */
	public void setTelefone(String  telefone) {
		this.telefone = telefone;
	}

	
	/** 
	 * @return funcao para saber o que e o nome
	 */
	public String getNome() {
		return nome;
	}

	
	/** 
	 * @param define o que e o nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	/** 
	 * @return funcao para saber o que e endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	
	/** 
	 * @param define o que e endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	/** 
	 * @return funcao para saber o que e o email
	 */
	public String getEmail() {
		return email;
	}

	
	/** 
	 * @param define o que e o email
	 */
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
