package model;

/** 
	 * @return Faz a declaracao das variacoes
	 */
public class Apartamento extends Imovel {
	private boolean elevador;
	private boolean varanda;
	private boolean condominio;


	public Apartamento(String n, String id, String end, double val,  String des, 
			int h, int q, int b, int c, boolean ele, boolean var, boolean con) {
		
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
	/** 
	 * @return Resume o apartamento somente com nome e valor
	 */
	public Apartamento(String n, double val) {
		this.nome = n;
		this.valor = val;
	}
	
	/** 
	 * @return Funcao para saber se tem elevador 
	 */
	public boolean isElevador() {
		return elevador;
	}

	
	public void setElevador(boolean elevador) {
		this.elevador = elevador;
	}


	
	/** 
	 * @return Funcao para saber se tem varanda
	 */
	public boolean isVaranda() {
		return varanda;
	}

	
	/** 
	 * @param Funcao para definir varanda
	 */
	public void setVaranda(boolean varanda) {
		this.varanda = varanda;
	}

	
	/** 
	 * @return Funcao para saber se tem condominio
	 */
	public boolean isCondominio() {
		return condominio;
	}

	
	/** 
	 * @param Funcao para saber se tem condominio
	 */
	public void setCondominio(boolean condominio) {
		this.condominio = condominio;
	}

}
