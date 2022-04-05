package model;

public class Casa extends Imovel {
	private boolean piscina;
	private int andar;

	public Casa(String id, String end, double val, String tit) {
		this.id = id;
		this.endereco = end;
		this.valor = val;
		this.nome = tit;
		
	}
	public String toString() {
		return "A casa: " + nome + " está no valor de R$" +valor;
	}

	public void cadastrarCasa() {

	}

	public void alterarCasa() {

	}

	public void deletarCasa() {

	}

	public boolean isPiscina() {
		return piscina;
	}

	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	public int isAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

}
