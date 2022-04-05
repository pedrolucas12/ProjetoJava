package control;

import java.util.ArrayList;

import model.Usuario;

public class ControleUsuario {

	ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	Usuario us = new Usuario();

	public ControleUsuario() {
		Usuario u1 = new Usuario("Fernando", "aa", "aa", "aa", "aa");
		Usuario u2 = new Usuario("Lucas", "", "aa", "aa", "aa");
		Usuario u3 = new Usuario("Felipe", "aa", "aa", "aa", "aa");
		Usuario u4 = new Usuario("Pedro", "aa", "aa", "aa", "aa");
		Usuario u5 = new Usuario("Daniel", "aa", "aa", "aa", "aa");

		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		listaUsuarios.add(u3);
		listaUsuarios.add(u4);
		listaUsuarios.add(u5);

	}
	
	//Funcao que cadastra um Usuario a ArrayList de Usuarios
	public void cadastraUsuario(Usuario u) {
		listaUsuarios.add(u);
	}
	//Funcao que retorna a quantidade de Usuarios que estao cadastrados
	public String numeroDeUsuarios() {
		return listaUsuarios.size() + " Usuarios cadastrados";
	}

	//public  String [] getNome(){
		//String [] nomes = new String[listaUsuarios.size()];
		//for(int i=0; i <listaUsuarios.size();i++) {
		//	nomes[i]= listaUsuarios.get(i);
		//}
		
	//}
	
	public ArrayList<Usuario> listarUsuarios() {
		return listaUsuarios;
	}

	

	

}
