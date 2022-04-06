package model;

public class Apartamento extends Imovel {
	private boolean elevador;
	private boolean varanda;
	private boolean condominio;

	public Apartamento(String n, String id, String end, double val, String des, int h, int q, int b, int c, boolean ele,
			boolean var, boolean con) {

		this.nome = n;
		this.id = id;
		this.endereco = end;
		this.valor = val;
		this.descricao = des;
		this.qtdHospedes = h;
		this.qtdBanheiros = b;
		this.qtdCamas = c;
		this.qtdQuartos = q;
		this.elevador = ele;
		this.varanda = var;
		this.condominio = con;
	}

	public Apartamento(String n, double val) {
		this.nome = n;
		this.valor = val;
	}

	public String toString() {
		return "O apartamento: " + nome + " está no valor de R$" + valor;
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

}
