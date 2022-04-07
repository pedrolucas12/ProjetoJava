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

import control.ControlReserva;

public class TelaReserva implements ActionListener, ListSelectionListener {

	private static JFrame janela = new JFrame();
	private static ControlReserva ctr;
	private static JButton excluir = new JButton("Excluir Reserva");
	private static JButton a = new JButton("Alterar Reserva");
	private static JLabel u = new JLabel("Usuario");
	private static JLabel c = new JLabel("Check-in");
	private static JLabel s = new JLabel("Check-out");
	private static JLabel im = new JLabel("Imovel");
	private JList<String> listaUsuarioReserva = new JList<String>();
	private JList<String> listaCheckinReserva = new JList<String>();
	private JList<String> listaCheckoutReserva = new JList<String>();
	private JList<String> listaImovelReserva = new JList<String>();
	int i;

	public TelaReserva(ControlReserva cont) {

		ctr = cont;

		listaUsuarioReserva.setListData(ctr.getListaUsuarioReserva());
		JScrollPane scrollPaneU = new JScrollPane();

		listaCheckinReserva.setListData(ctr.getListaCheckinReserva());
		JScrollPane scrollPaneCi = new JScrollPane();

		listaCheckoutReserva.setListData(ctr.getListaCheckoutReserva());
		JScrollPane scrollPaneCo = new JScrollPane();

		listaImovelReserva.setListData(ctr.getListaImovelReserva());
		JScrollPane scrollPaneI = new JScrollPane();

		scrollPaneU.setBounds(20, 50, 100, 300);
		scrollPaneCi.setBounds(150, 50, 100, 300);
		scrollPaneCo.setBounds(280, 50, 100, 300);
		scrollPaneI.setBounds(420, 50, 150, 300);

		excluir.setBounds(300, 380, 150, 30);
		a.setBounds(100, 380, 150, 30);

		u.setBounds(40, 15, 100, 30);
		c.setBounds(170, 15, 100, 30);
		s.setBounds(295, 15, 100, 30);
		im.setBounds(470, 15, 100, 30);

		janela.setSize(620, 500);
		janela.setVisible(true);
		janela.add(excluir);
		janela.add(a);

		janela.add(u);
		janela.add(c);
		janela.add(s);
		janela.add(im);
		janela.add(scrollPaneU);
		janela.add(scrollPaneCi);
		janela.add(scrollPaneCo);
		janela.add(scrollPaneI);
		janela.setLayout(null);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		janela.add(listaUsuarioReserva);
		janela.add(listaCheckinReserva);
		janela.add(listaCheckoutReserva);
		janela.add(listaImovelReserva);

		scrollPaneU.setViewportView(listaUsuarioReserva);
		scrollPaneCi.setViewportView(listaCheckinReserva);
		scrollPaneCo.setViewportView(listaCheckoutReserva);
		scrollPaneI.setViewportView(listaImovelReserva);

		excluir.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();

		if (src == excluir) {
			if (i >= 0) {
				ctr.getListaReservas().remove(i);
				listaUsuarioReserva.setListData(ctr.getListaUsuarioReserva());
				listaUsuarioReserva.updateUI();

			}
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();

		if (src == listaUsuarioReserva) {
			i = listaUsuarioReserva.getSelectedIndex();
		}
	}

}
