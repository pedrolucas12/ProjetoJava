package model;

public class Dados {

	private Usuario[] Usuario = new Usuario[50];
	private int qtdUsuarios = 0;

	private Usuario[] u;

	public void preCadastroUsuario() {
		Usuario u1 = new Usuario("Fernando", "Rua 3 casa 5, Brasilia-DF");
		Usuario u2 = new Usuario("Lucas", "Rua 3 casa 5, Brasilia-DF");
		Usuario u3 = new Usuario("Felipe", "Rua 3 casa 5, Brasilia-DF");
		Usuario u4 = new Usuario("Pedro", "Rua 3 casa 5, Brasilia-DF");
		Usuario u5 = new Usuario("Daniel", "Rua 3 casa 5, Brasilia-DF");
		u[0] = u1;
		u[1] = u2;
		u[2] = u3;
		u[3] = u4;
		u[4] = u5;
		qtdUsuarios = 5;

	}

	public Usuario[] getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario[] usuario) {
		Usuario = usuario;
	}

	public int getQtdUsuarios() {
		return qtdUsuarios;
	}

	public void setQtdUsuarios(int qtdUsuarios) {
		this.qtdUsuarios = qtdUsuarios;
	}

	public Usuario[] getU() {
		return u;
	}

	public void setU(Usuario[] u) {
		this.u = u;
	}

}
