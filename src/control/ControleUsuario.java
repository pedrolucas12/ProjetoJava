package control;

import java.util.ArrayList;

import model.Usuario;

public class ControleUsuario {

	ArrayList<Usuario> listaUsuarios = new ArrayList();

	public ControleUsuario() {

		Usuario u1 = new Usuario("Fernando", 0, 0, null, null);
		Usuario u2 = new Usuario("Lucas", 0, 0, null, null);
		Usuario u3 = new Usuario("Felipe", 0, 0, null, null);
		Usuario u4 = new Usuario("Pedro", 0, 0, null, null);
		Usuario u5 = new Usuario("Daniel", 0, 0, null, null);
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		listaUsuarios.add(u3);
		listaUsuarios.add(u4);
		listaUsuarios.add(u5);
	}

	public boolean cadastrarUsuario(Usuario u) {
		if (u != null) {
			listaUsuarios.add(u);
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Usuario> listarUsuarios() {
		return listaUsuarios;
	}
}
