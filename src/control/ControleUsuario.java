package control;



import model.Usuario;

public class ControleUsuario {

	private Usuario[] listaUsers;
	private int qtdUsuarios;

	public ControleUsuario(ControleDados d) {
		listaUsers = d.getUsuario();
		qtdUsuarios = d.getQtdUsuarios();
	}

	public String[] listarNomes() {
		String[] x = new String[qtdUsuarios];
		for(int i = 0; i < qtdUsuarios; i++) {
			x[i] = listaUsers[i].getNome();
		}
		
		return x;

	}

}
