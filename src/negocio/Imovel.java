package negocio;

public abstract class Imovel {
	protected int hospedes;
    protected int quartos;
    protected int banheiros;
    protected int camas;
    protected String endereco;
    protected String id;
    protected String titulo;
    protected String descricao;
    protected double valor;
    
	public int getHospedes() {
		return hospedes;
	}
	public void setHospedes(int hospedes) {
		this.hospedes = hospedes;
	}
	public int getQuartos() {
		return quartos;
	}
	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}
	public int getBanheiros() {
		return banheiros;
	}
	public void setBanheiros(int banheiros) {
		this.banheiros = banheiros;
	}
	public int getCamas() {
		return camas;
	}
	public void setCamas(int camas) {
		this.camas = camas;
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
