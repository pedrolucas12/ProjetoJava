package negocio;

public class Apartamento extends Imovel {
	private boolean elevador;
	private boolean varanda;
	private boolean condominio;
	
	public Apartamento(String id, String end, double val, String tit) {
		this.id = id;
		this.endereco = end;
		this.valor = val;
		this.titulo = tit;
		
		
		}
	
	
	public String toString() {
		return "O apartamento: " + titulo + " está no valor de R$" +valor;
	}
	
	
	
	public void cadastrarApt() {

	}

	public void alterarApt() {

	}

	public void deletarApt() {

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
