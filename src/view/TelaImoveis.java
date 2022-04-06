package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControlApartamento;
import control.ControlCasa;
import control.ControleUsuario;

public class TelaImoveis implements ActionListener, ListSelectionListener {

	private static JFrame janela = new JFrame();

	private static JButton btnReservarAp = new JButton("Reservar apartamento");
	private static JLabel ap = new JLabel("Apartamentos");
	private static JButton btnReservarCs = new JButton("Reservar casa");
	private static JLabel ca = new JLabel("Casas");
	private JList<String> listaAptCadastrados = new JList<String>();
	private JList<String> listaCasasCadastradas = new JList<String>();

	private static ControlApartamento cta;
	private static ControlCasa ctc;
	

	public void Tela(ControlApartamento conta, ControlCasa contc) {
		cta = conta;
		ctc = contc;

		listaAptCadastrados.setListData(cta.getListaNomesApt());
		JScrollPane scrollPaneApt = new JScrollPane();
		
		listaCasasCadastradas.setListData(ctc.getListaNomesCasa());
		JScrollPane scrollPaneCasa = new JScrollPane();

		
		scrollPaneApt.setBounds(20, 50, 250, 300);
		scrollPaneCasa.setBounds(300, 50, 250, 300);

		btnReservarAp.setBounds(40, 360, 200, 40);
		ap.setBounds(100, 5, 100, 40);
		btnReservarCs.setBounds(330, 360, 200, 40);
		ca.setBounds(400, 5, 100, 40);
		janela.setSize(600, 500);
		janela.setVisible(true);

		janela.add(btnReservarAp);
		janela.add(ap);
		janela.add(btnReservarCs);
		janela.add(ca);
		janela.add(scrollPaneApt);
		janela.add(scrollPaneCasa);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		janela.add(listaAptCadastrados);
		scrollPaneApt.setViewportView(listaAptCadastrados);
		listaAptCadastrados.addListSelectionListener(this);
		
		janela.add(listaCasasCadastradas);
		scrollPaneCasa.setViewportView(listaCasasCadastradas);
		listaCasasCadastradas.addListSelectionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}

}
