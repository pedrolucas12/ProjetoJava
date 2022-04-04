package model;
import java.util.*;

public class Apartamento extends Imovel {
	//declara tudo do Apartamento
	private boolean elevador;
	private boolean varanda;
	private boolean condominio;
	
	public Apartamento(String id, String end, double val, String tit) {
		//mostra o valor de cada variavel
		this.id = id;
		this.endereco = end;
		this.valor = val;
		this.titulo = tit;
		}
	public String toString() {
		return "O apartamento: " + titulo + " est� no valor de R$" +valor; //passa o valor do apartamento para usuario	
	}
	
	public boolean isElevador() {
		return elevador;
	}
	public void setElevador(boolean elevador) {
		this.elevador = elevador;
	}
	public boolean isVaranda() {
		return varanda;
	}
	public void setVaranda(boolean varanda) {
		this.varanda = varanda;
	}
	public boolean isCondominio() {
		return condominio;
	}
	public void setCondominio(boolean condominio) {
		this.condominio = condominio;
	}
	class CRUD{
		public static void main(String[] args){
		Collection<Apartamento> c = new ArrayList<Apartamento>{};
		Scanner s = new Scanner(System.in);
		int opcao;
		do{
			System.out.println("1 - CADASTRAR ");
			System.out.println("2 - ALTERAR ");
			System.out.println("3 - DELETAR");
			System.out.println("Qual opcao voce vai escolher?");
			opcao = s.nextInt();

			switch(opcao){
				case 1:
					System.out.println("Qual seu nome? > ");
					String nome = s.nextString();
					System.out.println("Qual seu CPF? > ");
					String cpf = s.nextString();
					System.out.println("Qual seu email? >");
					String email = s.nextString();
					System.out.println("Qual seu telefone? >");
					Int telefone = s.nextInt();
					System.out.println("Qual sua data de nascimento? > ");
					Int nascimento = s.nextInt();
					System.out.println("Qual seu endereco? > ");
					String endereco = s.nextString();

				break;
			}
		}while(opcao!=0);
	}
}

	/*public void cadastrarApt(String id, String endereco, Int valor, String titulo) { //funcao para cadastro
		this.id = id;
		this.endereco = endereco;
		this.valor = valor;
		this.titulo = titulo;
	} */

	public void alterarApt() { //funcao para alterar

	}


	public void deletarApt() {

	}
	
	
}
