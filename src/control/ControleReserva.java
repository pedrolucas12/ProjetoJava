package control;

import java.util.ArrayList;

import model.Casa;
import model.Reserva;
import model.Usuario;

public class ControleReserva {

	ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
	

	public ControleReserva() {
		Reserva r1 = new Reserva("Fernando", "19/07/2022", "24/07/2022", "Apartamento Brasilia");
		Reserva r2 = new Reserva("Lucas", "19/07/2022", "24/07/2022", "Casa Santos");
		Reserva r3 = new Reserva("Felipe", "19/07/2022", "24/07/2022", "Casa Ouro Preto");
		Reserva r4 = new Reserva("Pedro", "19/07/2022", "24/07/2022", "Apartamento Sao Paulo");
		Reserva r5 = new Reserva("Daniel", "19/07/2022", "24/07/2022", "Apartamento Goiania");

		listaReservas.add(r1);
		listaReservas.add(r2);
		listaReservas.add(r3);
		listaReservas.add(r4);
		listaReservas.add(r5);

	}
	
	// Funcao que cadastra uma reserva na arraylist de reservas
		public void cadastraReserva(Reserva r) {
			listaReservas.add(r);
		}

		//Funcao que retorna a ArrayList de reservas
		public ArrayList<Reserva> getListaReservas() {
			return listaReservas;
		}

		//Funcao que retorna vetor com nomes dos usuarios que fizeram reserva
		public String[] getListaUsuarioReserva() {
			String[] usuariosReservas = new String[listaReservas.size()];
			int i = 0;
			for (Reserva r : getListaReservas()) {
				usuariosReservas[i] = r.getUsuario();
				i++;
			}
			return usuariosReservas;
		}
		
		public String[] getListaCheckinReserva() {
			String[] checkinReservas = new String[listaReservas.size()];
			int i = 0;
			for (Reserva r : getListaReservas()) {
				checkinReservas[i] = r.getCheckin();
				i++;
			}
			return checkinReservas;
		}
		
		public String[] getListaImovelReserva() {
			String[] imovelReservas = new String[listaReservas.size()];
			int i = 0;
			for (Reserva r : getListaReservas()) {
				imovelReservas[i] = r.getImovel();
				i++;
			}
			return imovelReservas;
		}
		
		public String[] getListaCheckoutReserva() {
			String[] checkout = new String[listaReservas.size()];
			int i = 0;
			for (Reserva r : getListaReservas()) {
				checkout[i] = r.getCheckout();
				i++;
			}
			return checkout;
		}
}
