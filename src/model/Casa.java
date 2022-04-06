package model;

/** 
	 * @return Define os atributos
	 */
public class Casa extends Imovel {
	private boolean piscina;
	private int andar;

<<<<<<< HEAD
	/** 
	 * @return Define o que é a casa
	 */
	public Casa(String id, String end, double val, String tit) {
		this.id = id;
		this.endereco = end;
=======
	public Casa(String nome, double val) {
		this.nome = nome;
>>>>>>> be55cc846c362b6858b45a0911df57e08598d2dd
		this.valor = val;
		
		
	}
	public Casa() {
		
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
