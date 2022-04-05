package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TelaReserva implements ActionListener{
	
	private static JFrame janela = new JFrame();
	private static JButton e = new JButton("Excluir");
	private static JButton a = new JButton("Alterar");
	private static JLabel r = new JLabel("Reserva");

    public TelaReserva() {
		e.setBounds(250, 50, 100, 30);
		a.setBounds(250, 100, 100, 30);
		r.setBounds(150, 5, 100, 40);
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.add(e);
		janela.add(a);
		janela.add(r);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //Object src = e.getSource();
    }

}
