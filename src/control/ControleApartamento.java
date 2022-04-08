package control;

import java.util.ArrayList;

import model.Apartamento;
import model.Usuario;

public class ControleApartamento {

	ArrayList<Apartamento> listaApartamentos = new ArrayList<Apartamento>();

	public ControleApartamento() {
		Apartamento a1 = new Apartamento("Apartamento Brasilia", "SQSW", 10.0, 2,2,2,2, 's','s','s');
		Apartamento a2 = new Apartamento("Apartamento Balneario","SQSW", 90.0, 2,2,2,2, 's','s','s');
		Apartamento a3 = new Apartamento("Apartamento Curitiba", "SQSW",50.0, 2,2,2,2, 's','s','s');
		Apartamento a4 = new Apartamento("Apartamento Goiania", "SQSW",150.0, 2,2,2,2, 's','s','s');
		Apartamento a5 = new Apartamento("Apartamento Sao Paulo", "SQSW",300.0, 2,2,2,2, 's','s','s');

		listaApartamentos.add(a1);
		listaApartamentos.add(a2);
		listaApartamentos.add(a3);
		listaApartamentos.add(a4);
		listaApartamentos.add(a5);

	}

	// Funcao que cadastra um apt a ArrayList de apt
	public void cadastraApartamento(Apartamento a) {
		listaApartamentos.add(a);
	}

	//Funcao que retorna a ArrayList de apartamentos
	public ArrayList<Apartamento> getLista() {
		return listaApartamentos;
	}
	
	//Funcao que cria lista de nomes dos apartamentos
	public String[] getListaNomesApt() {
		String[] nomesApt = new String[listaApartamentos.size()];
		int i = 0;
		for (Apartamento apt : getLista()) {
			nomesApt[i] = apt.getNome();
			i++;
		}
		return nomesApt;
	}

}