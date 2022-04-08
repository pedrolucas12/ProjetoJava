package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleApartamento;
import control.ControleCasa;
import control.ControleReserva;
import control.ControleUsuario;
import model.Apartamento;
import model.Reserva;
import model.Usuario;

public class TelaReservar implements ActionListener  {

	int i = 0;
	private static JFrame janela = new JFrame();
	private static JButton salvar = new JButton("Salvar Reserva");

	private static JLabel checkin = new JLabel(" Data Check-in:");
	private static JLabel checkout = new JLabel("Data Check-out:");
	private static JLabel usuario = new JLabel("Usuario:");
	private static JLabel apt = new JLabel("Apartamento:");
	private JTextField tfCheckin = new JTextField();
	private JTextField tfCheckout = new JTextField();
	private JTextField tfUsuario = new JTextField();
	private JTextField tfApt = new JTextField();
	private static TelaImoveis ti = new TelaImoveis();
	private static Usuario u;
	private static Apartamento a;

	private static ControleUsuario ctu = new ControleUsuario();
	private static ControleApartamento cta = new ControleApartamento();
	private static ControleCasa ctc = new ControleCasa();
	private static ControleReserva ctr = new ControleReserva();

	private static String listaU[];
	private static String listaA[];

	private static int x;
	private static int y;

	public TelaReservar() {
		checkin.setBounds(20, 30, 100, 40);
		checkout.setBounds(20, 70, 100, 40);
		usuario.setBounds(20, 110, 100, 40);
		apt.setBounds(20, 150, 100, 40);

		tfCheckin.setBounds(130, 40, 100, 20);
		tfCheckout.setBounds(130, 80, 100, 20);
		tfUsuario.setBounds(130, 120, 100, 20);
		tfApt.setBounds(130, 160, 100, 20);

		salvar.setBounds(90, 210, 150, 30);

		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.add(checkin);
		janela.add(checkout);
		janela.add(usuario);
		janela.add(tfUsuario);
		janela.add(tfCheckin);
		janela.add(tfCheckout);
		janela.add(apt);
		janela.add(tfApt);
		janela.add(salvar);
		janela.setLayout(null);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		salvar.addActionListener(this);

	}

	public void salvarReservaApt() {

		String checkin = tfCheckin.getText();
		String checkout = tfCheckout.getText();
		String sUsuario = tfUsuario.getText();
		String sApt = tfApt.getText();

		listaU = ctu.getListaNomes();
		listaA = cta.getListaNomesApt();
		x = 0;

		for (int i = 0; i < listaU.length; i++) {
			

			if (sUsuario.equalsIgnoreCase(listaU[i])) {
				x = 1;
				
				break;
			}

		}
		
		if (x == 1) {
			for (int i = 0; i < listaA.length; i++) {
				if (sApt.equalsIgnoreCase(listaA[i])) {
					Reserva r = new Reserva(sUsuario, checkin, checkout, sApt);
					ctr.cadastraReserva(r);
					JOptionPane.showMessageDialog(null, "Reserva feita com sucesso!");
					y = 1;
					break;

				}
			}

		}else {
			JOptionPane.showMessageDialog(null, "Usuario nao encontrado");
		}
		if(y != 1) {
			JOptionPane.showMessageDialog(null, "Apartamento nao encontrado");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == salvar) {
			salvarReservaApt();
			new TelaMenu();
		}

	}

	

}
