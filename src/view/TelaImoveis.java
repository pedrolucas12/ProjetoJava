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

import control.ControleApartamento;
import control.ControleCasa;
import control.ControleUsuario;

public class TelaImoveis implements ActionListener, ListSelectionListener {

	private static JFrame janela = new JFrame();

	private static JButton btnReservarAp = new JButton("Reservar apartamento");
	private static JLabel ap = new JLabel("Apartamentos");
	private static JButton btnReservarCs = new JButton("Reservar casa");
	private static JLabel ca = new JLabel("Casas");
	private static JButton btnExcluirApt = new JButton("Excluir apartamento");
	private static JButton btnExcluirCs = new JButton("Excluir casa");
	private static JButton btnAtualizarApt = new JButton("Atualizar");
	private static JButton btnAtualizarCs = new JButton("Atualizar");
	private static JButton btnCadastrarApt = new JButton("Cadastrar apartamento");
	private static JButton btnCadastrarCs = new JButton("Cadastrar casa");
	private JList<String> listaAptCadastrados = new JList<String>();
	private JList<String> listaCasasCadastradas = new JList<String>();

	private static ControleApartamento cta;
	private static ControleCasa ctc;

	private static int i;

	
	/** 
	 * @param Funcao que constroi a tela de imoveis
	 * 
	 * @param 
	 */
	public void Tela(ControleApartamento conta, ControleCasa contc) {
		this.cta = conta;
		this.ctc = contc;

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

		btnExcluirApt.setBounds(40, 420, 200, 40);
		btnAtualizarApt.setBounds(40, 480, 200, 40);
		btnExcluirCs.setBounds(330, 420, 200, 40);
		btnAtualizarCs.setBounds(330, 480, 200, 40);
		btnCadastrarApt.setBounds(40, 540, 200, 40);
		btnCadastrarCs.setBounds(330, 540, 200, 40);

		janela.setSize(600, 650);
		janela.setVisible(true);

		janela.add(btnExcluirApt);
		janela.add(btnAtualizarApt);
		janela.add(btnExcluirCs);
		janela.add(btnAtualizarCs);
		janela.add(btnReservarAp);
		janela.add(btnCadastrarCs);
		janela.add(btnCadastrarApt);
		janela.add(ap);
		janela.add(btnReservarCs);
		janela.add(ca);
		janela.add(scrollPaneApt);
		janela.add(scrollPaneCasa);
		janela.setLayout(null);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		janela.add(listaAptCadastrados);
		scrollPaneApt.setViewportView(listaAptCadastrados);
		listaAptCadastrados.addListSelectionListener(this);

		janela.add(listaCasasCadastradas);
		scrollPaneCasa.setViewportView(listaCasasCadastradas);
		listaCasasCadastradas.addListSelectionListener(this);

		btnReservarAp.addActionListener(this);
		btnReservarCs.addActionListener(this);
		btnExcluirApt.addActionListener(this);
		btnExcluirCs.addActionListener(this);
		btnAlterarApt.addActionListener(this);
		btnAlterarCs.addActionListener(this);
		btnCadastrarApt.addActionListener(this);
		btnCadastrarCs.addActionListener(this);
		
		listaAptCadastrados.updateUI();
		listaCasasCadastradas.updateUI();
		
	}

	/** 
	 * @param Funcao que cria um evento a partir do botao selecionado
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == btnReservarAp) {
			
			janela.dispose();
			new TelaReservar();
			listaAptCadastrados.updateUI();

		}
		if (src == btnReservarCs) {
			
			janela.dispose();
			
			new TelaReservar();

		}
		if (src == btnExcluirApt) {
			if (i >= 0) {
				cta.getLista().remove(i);
				listaAptCadastrados.setListData(cta.getListaNomesApt());
				listaAptCadastrados.updateUI();

			}
		}
		if (src == btnExcluirCs) {
			if (i >= 0) {
				ctc.getLista().remove(i);
				listaCasasCadastradas.setListData(ctc.getListaNomesCasa());
				listaCasasCadastradas.updateUI();

			}
		}
		if (src == btnAlterarApt) {
			listaAptCadastrados.setListData(cta.getListaNomesApt());
			listaAptCadastrados.updateUI();
			listaCasasCadastradas.setListData(ctc.getListaNomesCasa());
			listaCasasCadastradas.updateUI();
		}
		if (src == btnAlterarCs) {
			
		}
		if (src == btnCadastrarApt) {
			janela.dispose();
			new TelaCadastroImovel().CadastroApartamento();
			listaAptCadastrados.setListData(cta.getListaNomesApt());
			listaAptCadastrados.updateUI();
			
		}
		if (src == btnCadastrarCs) {
			janela.dispose();
			new TelaCadastroImovel().CadastroCasa();
			listaCasasCadastradas.setListData(ctc.getListaNomesCasa());
			listaCasasCadastradas.updateUI();
		}

	}

	
	/** 
	 * @param Funcao para pegar o index da lista selecionada
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (src == listaAptCadastrados) {
			i = listaAptCadastrados.getSelectedIndex();
			retornaListaApt();

		}
		if (src == listaCasasCadastradas) {
			i = listaCasasCadastradas.getSelectedIndex();
		}
	}

}
