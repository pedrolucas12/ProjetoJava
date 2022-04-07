package model;

/**
 * @return Apresenta as variaveis da reserva
 */
public class Reserva {

	private String checkin;
	private String checkout;
	private String usuario;
	private String imovel;

	public Reserva(String u, String cin, String cou, String i) {

		this.checkin = cin;
		this.checkout = cou;
		this.usuario = u;
		this.imovel = i;

	}

	/**
	 * @return funcao para saber o que e checkin
	 */
	public String getCheckin() {
		return checkin;
	}

	/**
	 * @param funcao para definir o Checkin
	 */
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	/**
	 * @return funcao para saber o que e checkout
	 */
	public String getCheckout() {
		return checkout;
	}

	/**
	 * @param funcao para definir o checkout
	 */
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

}
