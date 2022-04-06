package model;

/** 
	 * @return Define os atributos
	 */
public class Casa extends Imovel {
	private boolean piscina;
	private int andar;

	/** 
	 * @return Define o que é a casa
	 */
	public Casa(String id, String end, double val, String tit) {
		this.id = id;
		this.endereco = end;
		this.valor = val;
		this.nome = tit;
		
	}
	public Casa(String string, double d) {
    }
    
	/** 
	 * @return Mostra o valor da casa para o usuario
	 */
	public String toString() {
		return "A casa: " + nome + " est� no valor de R$" +valor;
	}

	public void cadastrarCasa() {

	}

	public void alterarCasa() {

	}

	public void deletarCasa() {

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
