package model;
/** 
	 * @return Define o que é imovel
	 */
public abstract class Imovel {
	protected int qtdHospedes;
    protected int qtdQuartos;
    protected int qtdBanheiros;
    protected int qtdCamas;
    protected String endereco;
    protected String id;
    protected String nome;
    protected String descricao;
    protected double valor;

	
	/** 
	 * @return funcao para saber a qnt de hospedes
	 */
	public int getQtdHospedes() {
		return qtdHospedes;
	}
	
	/** 
	 * @param funcao para definir a qnt de hospedes
	 */
	public void setQtdHospedes(int qtdHospedes) {
		this.qtdHospedes = qtdHospedes;
	}
	
	/** 
	 * @return funcao para saber a qnt de quartos
	 */
	public int getQtdQuartos() {
		return qtdQuartos;
	}
	
	/** 
	 * @param funcao para definir a qnt de quartos
	 */
	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}
	
	/** 
	 * @return funcao para saber a qnt de banheiros
	 */
	public int getQtdBanheiros() {
		return qtdBanheiros;
	}
	
	/** 
	 * @param funcao para definir a qnt de banheiros
	 */
	public void setQtdBanheiros(int qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}
	
	/** 
	 * @return funcao para saber a qnt de camas
	 */
	public int getQtdCamas() {
		return qtdCamas;
	}
	
	/** 
	 * @param funcao para definir a qnt de camas
	 */
	public void setQtdCamas(int qtdCamas) {
		this.qtdCamas = qtdCamas;
	}
	
	/** 
	 * @return funcao para saber o endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	
	/** 
	 * @param funcao para definir o endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/** 
	 * @return funcao para saber o id
	 */
	public String getId() {
		return id;
	}
	
	/** 
	 * @param funcao para definir o id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/** 
	 * @return funcao para saber o nome
	 */
	public String getNome() {
		return nome;
	}
	
	/** 
	 * @param funcao para definir o que é o nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/** 
	 * @return funcao para saber a descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/** 
	 * @param funcao para definir a descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/** 
	 * @return funcao para saber o valor
	 */
	public double getValor() {
		return valor;
	}
	
	/** 
	 * @param funcao para definir os valores
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
    
	
	
    
     

}
