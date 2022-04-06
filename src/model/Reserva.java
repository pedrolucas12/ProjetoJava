package model;

/** 
	 * @return Apresenta as variaveis da reserva
	 */
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
	
	
	/** 
	 * @return Espaco para trazer as funcoes da reserva
	 */
	public String toString() {
		return "A reserva do c�digo " + codigo + " est� reservada no per�odo de " +periodo + " dias. ";
				
	}
	
	public void cadastrarReserva() {

	}

	public void alterarReserva() {

	}

	public void cancelarReserva() {

	}

	
	/** 
	 * @return funcao para saber o que é o periodo
	 */
	public int getPeriodo() {
		return periodo;
	}

	
	/** 
	 * @param funcao para definir o que é periodo
	 */
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	
	/** 
	 * @return funcao para saber o que é checkin
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
	 * @return funcao para saber o que é checkout
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

	
	/** 
	 * @return funcao para saber se tem codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	
	/** 
	 * @param funcao para definir o codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
