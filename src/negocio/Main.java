package negocio;


public class Main {

	static Apartamento ap1;
	static Casa c1;
	static Usuario u1;
	static Reserva r1;
	
	public static void main(String[] args) {
		
		
		ap1 = new Apartamento( "1", "Brasilia", 1200.00, "Apartamento asa sul");

		c1 = new Casa( "2", "São Paulo", 2500.00, "Casa Santos");
		
		u1 = new Usuario("Fernando", "Rua 3 casa 5, Brasilia-DF");
		
		r1 = new Reserva(5, "20/03/2022", "24/03/2022", 321);
		
		
		System.out.println(ap1);
		System.out.println(c1);
		System.out.println(u1);
		System.out.println(r1);
	}

}
