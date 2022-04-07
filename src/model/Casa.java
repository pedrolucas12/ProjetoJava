package model;

/**
 * @return Define os atributos
 */
public class Casa extends Imovel {
	private boolean piscina;
	private int andar;

	public Casa(String nome, double val) {
		this.nome = nome;
		this.valor = val;

	}

	/**
	 * @return funcao para saber se tem piscina
	 */
	public boolean isPiscina() {
		return piscina;
	}

	/**
	 * @param funcao para definir piscina
	 */
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}

	/**
	 * @return funcao para saber quantos andares
	 */
	public int isAndar() {
		return andar;
	}

	/**
	 * @param funcao para definir os andares
	 */
	public void setAndar(int andar) {
		this.andar = andar;
	}

}
