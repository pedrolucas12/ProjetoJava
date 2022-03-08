package negocio;

public class Apartamento extends Imovel {
	private boolean elevador;
	private boolean varanda;
	private boolean condominio;
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
