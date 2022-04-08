package control;

import java.util.ArrayList;

import model.Casa;

public class ControleCasa {

	ArrayList<Casa> listaCasas = new ArrayList<Casa>();

	public ControleCasa() {
		Casa c1 = new Casa("Casa Fortaleza", "Rua 5",105.0, 1,1,1,1, 's', 2);
		Casa c2 = new Casa("Casa Santa Catarina", "Rua 5",100.0, 1,1,1,1, 's', 2);
		Casa c3 = new Casa("Casa Itacare", "Rua 5",205.0, 1,1,1,1, 's', 2);
		Casa c4 = new Casa("Casa Ouro Preto", "Rua 5",120.0, 1,1,1,1, 's', 2);
		Casa c5 = new Casa("Casa Santos", "Rua 5",185.0, 1,1,1,1, 's', 2);

		listaCasas.add(c1);
		listaCasas.add(c2);
		listaCasas.add(c3);
		listaCasas.add(c4);
		listaCasas.add(c5);

	}

	// Funcao que cadastra um Imovel a ArrayList de Imoveis
	public void cadastraCasa(Casa c) {
		listaCasas.add(c);
	}

	//Funcao que retorna a ArrayList de casas
	public ArrayList<Casa> getLista() {
		return listaCasas;
	}

	//Funcao que retorna vetor com nomes das casas
	public String[] getListaNomesCasa() {
		String[] nomesCasas = new String[listaCasas.size()];
		int i = 0;
		for (Casa casa : getLista()) {
			nomesCasas[i] = casa.getNome();
			i++;
		}
		return nomesCasas;
	}
}
