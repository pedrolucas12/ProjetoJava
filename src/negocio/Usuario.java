package negocio;

import java.util.Date;

public class Usuario {
	private int cpf;
	private int telefone;
	private String nome;
	private String endereco;
	private String email;
	private Date nascimento;

	
	public Usuario(String n, String end) {
		this.nome = n;
		this.endereco = end;
	}
	
	public String toString() {
		return "O usuário " + nome + " cadastrou o endereço " +endereco;
	}
		
	public void listarUsuarios() {

	}

	public void cadastrarUsuario() {

	}

	public void deletarUsuario() {

	}

	public void alterarUsuario() {

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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

}
