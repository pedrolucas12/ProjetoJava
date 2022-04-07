package model;

/**
 * @return Define os atributos
 */
public class Casa extends Imovel {
	private char piscina;
	private int andar;

	public Casa(String n,  String end, double val,  int h, int q, int b, int c, 
			char pis, int and) {

		this.nome = n;

		this.endereco = end;
		this.valor = val;

		this.qtdHospedes = h;
		this.qtdBanheiros = b;
		this.qtdCamas = c;
		this.qtdQuartos = q;
		this.piscina = pis;;
		this.andar = and;
		

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
