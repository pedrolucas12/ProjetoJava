package control;

import model.Dados;
import model.Usuario;

public class ControleDados{
	private Dados d = new Dados();

	public ControleDados() {
		d.preCadastroUsuario();
	}

	public Dados getD() {
		return d;
	}

	public void setD(Dados d) {
		this.d = d;
	}
	
	public Usuario[] getUsuario() {
		return this.d.getUsuario();
	}
	public int getQtdUsuarios() {
		return this.d.getQtdUsuarios();
	}
}