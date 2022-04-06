package control;

import java.util.ArrayList;

import model.Casa;

public class ControlCasa {

	ArrayList<Casa> listaCasas = new ArrayList<Casa>();

	public ControlCasa() {
		Casa c1 = new Casa("Casa Fortaleza", 105.0);
		Casa c2 = new Casa("Casa Santa Catarina", 905.0);
		Casa c3 = new Casa("Casa Itacare", 505.0);
		Casa c4 = new Casa("Casa Ouro Preto", 150.0);
		Casa c5 = new Casa("Casa Santos", 308.0);

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
