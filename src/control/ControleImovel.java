package control;

import java.util.ArrayList;

import model.Apartamento;

public class ControleImovel {

	ArrayList<Apartamento> listaApartamentos = new ArrayList<Apartamento>();

    public void ControleApartamento() {
		Apartamento a1 = new Apartamento("Apartamento Brasilia", 10.0);
		Apartamento a2 = new Apartamento("Apartamento Balneario", 90.0);
		Apartamento a3 = new Apartamento("Apartamento Curitiba", 50.0);
		Apartamento a4 = new Apartamento("Apartamento Goiania",150.0);
		Apartamento a5 = new Apartamento("Apartamento São Paulo", 300.0);

		listaApartamentos.add(a1);
		listaApartamentos.add(a2);
		listaApartamentos.add(a3);
		listaApartamentos.add(a4);
		listaApartamentos.add(a5);

    }

	//Funcao que cadastra um Imovel a ArrayList de Imoveis
	public void cadastraApartamento(Apartamento a) {
		listaApartamentos.add(a);
	}



}
