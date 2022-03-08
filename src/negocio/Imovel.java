package negocio;

public abstract class Imovel {
	private int hospedes;
    private int quartos;
    private int banheiros;
    private int camas;
    private String endereco;
    private String id;
    private String titulo;
    private String descricao;
    private double valor;
    private boolean wifi;
    private boolean garagem;
    private boolean pets;
	
    
    
    
    
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
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isGaragem() {
		return garagem;
	}
	public void setGaragem(boolean garagem) {
		this.garagem = garagem;
	}
	public boolean isPets() {
		return pets;
	}
	public void setPets(boolean pets) {
		this.pets = pets;
	}
    
    

}
