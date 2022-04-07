package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroImovel {
	private static JFrame janela = new JFrame();
	private static JButton salvar = new JButton("Salvar Reserva");

	private static JLabel qtdH = new JLabel("Quantidade de hospedes");
	private static JLabel qtdB = new JLabel("Quantidade de banheiros");
	private static JLabel qtdQ = new JLabel("Quantidade de quartos");
	private static JLabel qtdC = new JLabel("Quantidade de camas");
	private static JLabel end = new JLabel("Endereco");
	private static JLabel nome = new JLabel("Nome");
	private static JLabel val = new JLabel("Valor diaria");
	private static JLabel ele = new JLabel("Possui elevador?");
	private static JLabel var = new JLabel("Possui varanda?");
	private static JLabel con = new JLabel("Possui condominio?");
	private JTextField tfH= new JTextField();
	private JTextField tfB = new JTextField();
	private JTextField tfQ = new JTextField();
	private JTextField tfC = new JTextField();
	private JTextField tfEnd = new JTextField();
	private JTextField tfNome = new JTextField();
	private JTextField tfVal = new JTextField();
	private JTextField tfEle = new JTextField();
	private JTextField tfCon = new JTextField();
	private JTextField tfVar = new JTextField();

	public void CadastroCasa() {
		
		
	}

	public void CadastroApartamento() {

		qtdH.setBounds(10, 50, 100, 20);
		tfH.setBounds(10, 80, 100, 20);
		qtdB.setBounds(10, 110, 100, 20);
		tfB.setBounds(10, 140, 100, 20);
		qtdQ.setBounds(10, 170, 100, 20);
		tfQ.setBounds(70, 50, 100, 20);
		tfCpf.setBounds(70, 80, 100, 20);
		tfEmail.setBounds(70, 110, 100, 20);
		tfEndereco.setBounds(70, 170, 100, 20);
		tfTelefone.setBounds(70, 140, 100, 20);
		numUsersCadastrados.setBounds(10, 230, 200, 20);
		salvar.setBounds(70, 200, 90, 30);
		excluir.setBounds(230, 320, 90, 30);
		alterar.setBounds(350, 320, 90, 30);

		janela.setSize(500, 400);
		janela.setVisible(true);
		janela.add(qtdH);
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();
		janela.add();

		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
