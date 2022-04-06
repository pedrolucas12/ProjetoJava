package model;

public class Casa extends Imovel {
	private boolean piscina;
	private int andar;

	public Casa(String nome, double val) {
		this.nome = nome;
		this.valor = val;
		
		
	}
	public Casa() {
		
    }
    public String toString() {
		return "A casa: " + nome + " est� no valor de R$" +valor;
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
