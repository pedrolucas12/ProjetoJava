package model;

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
	public int getQtdHospedes() {
		return qtdHospedes;
	}
	public void setQtdHospedes(int qtdHospedes) {
		this.qtdHospedes = qtdHospedes;
	}
	public int getQtdQuartos() {
		return qtdQuartos;
	}
	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}
	public int getQtdBanheiros() {
		return qtdBanheiros;
	}
	public void setQtdBanheiros(int qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}
	public int getQtdCamas() {
		return qtdCamas;
	}
	public void setQtdCamas(int qtdCamas) {
		this.qtdCamas = qtdCamas;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
    
	
	
    
     

}
