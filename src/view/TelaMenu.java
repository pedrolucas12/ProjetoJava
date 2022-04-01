package view;

import java.awt.event.*;
import javax.swing.*;

import control.ControleDados;

public class TelaMenu implements ActionListener {

	private static JFrame janela = new JFrame();
	private static JButton u = new JButton("Usuário");
	private static JButton r = new JButton("Reserva");
	private static JButton i = new JButton("Imóveis");
	private static JLabel t = new JLabel("MENU");
	

	//Construtor
	public TelaMenu() {
		t.setBounds(150, 10, 150, 40);
		u.setBounds(130, 60, 100, 40);
		r.setBounds(130, 120, 100, 40);
		i.setBounds(130, 180, 100, 40);
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.add(u);
		janela.add(r);
		janela.add(i);
		janela.add(t);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Main
	public static void main(String[] args) {

		TelaMenu menu = new TelaMenu();
		
		u.addActionListener(menu);
		r.addActionListener(menu);
		i.addActionListener(menu);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		
		if (src == u)
			new TelaUsuario();

		if (src == r)
			new TelaReserva();

		if (src == i)
			new TelaImoveis();
	}
}
