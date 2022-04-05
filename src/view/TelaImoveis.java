package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TelaImoveis implements ActionListener{
	
	private static JFrame janela = new JFrame();
	private static JButton c = new JButton("Cadastrar");
	private static JButton e = new JButton("Excluir");
	private static JButton a = new JButton("Alterar");
	private static JButton r = new JButton("Reservar");
	private static JLabel i = new JLabel("Imoveis");

	
	public TelaImoveis() {
		
		c.setBounds(250, 50, 100, 30);
		e.setBounds(250, 100, 100, 30);
		a.setBounds(250, 150, 100, 30);
		r.setBounds(30, 200, 150, 30);
		i.setBounds(150, 5, 100, 40);
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.add(c);
		janela.add(e);
		janela.add(a);
		janela.add(r);
		janela.add(i);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		
		
		
	}


	
	
	
	
	
}


