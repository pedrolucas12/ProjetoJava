package model;

/**
 * @return Faz a declaracao das variacoes
 */
public class Apartamento extends Imovel {
	private char elevador;
	private char varanda;
	private char condominio;

	public Apartamento(String n,  String end, double val,  int h, int q, int b, int c, 
			char ele, char var, char con) {

		this.nome = n;

		this.endereco = end;
		this.valor = val;

		this.qtdHospedes = h;
		this.qtdBanheiros = b;
		this.qtdCamas = c;
		this.qtdQuartos = q;
		this.elevador = ele;
		this.varanda = var;
		this.condominio = con;
	}

	

	public char getElevador() {
		return elevador;
	}

	public void setElevador(char elevador) {
		this.elevador = elevador;
	}

	public char getVaranda() {
		return varanda;
	}

	public void setVaranda(char varanda) {
		this.varanda = varanda;
	}

	public char getCondominio() {
		return condominio;
	}

	public void setCondominio(char condominio) {
		this.condominio = condominio;
	}

	

}
