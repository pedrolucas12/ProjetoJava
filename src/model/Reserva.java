package model;

public class Reserva {
	private int periodo;
	private String checkin;
	private String checkout;
	private int codigo;

	public Reserva(int per, String cin, String cou, int cod) {
		this.periodo = per;
		this.checkin = cin;
		this.checkout = cou;
		this.codigo = cod;
	}
	
	public String toString() {
		return "A reserva do código " + codigo + " está reservada no período de " +periodo + " dias. ";
				
	}
	
	public void cadastrarReserva() {

	}

	public void alterarReserva() {

	}

	public void cancelarReserva() {

	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
