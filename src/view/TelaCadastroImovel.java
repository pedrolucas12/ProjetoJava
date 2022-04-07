package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.ControlApartamento;
import model.Apartamento;

public class TelaCadastroImovel implements ActionListener {
	private static JFrame janela = new JFrame();
	private static JButton salvarAp = new JButton("Salvar apartamento");
	private static JButton salvarCs = new JButton("Salvar casa");

	private static JLabel qtdH = new JLabel("Quantidade de hospedes");
	private static JLabel qtdB = new JLabel("Quantidade de banheiros");
	private static JLabel qtdQ = new JLabel("Quantidade de quartos");
	private static JLabel qtdC = new JLabel("Quantidade de camas");
	private static JLabel end = new JLabel("Endereco");
	private static JLabel nome = new JLabel("Nome");
	private static JLabel val = new JLabel("Valor diaria");
	private static JLabel ele = new JLabel("Possui elevador? (s/n)");
	private static JLabel var = new JLabel("Possui varanda? (s/n)");
	private static JLabel con = new JLabel("Possui condominio? (s/n)");
	private static JLabel and = new JLabel("Quantos andares?");
	private static JLabel pis = new JLabel("Possui piscina? (s/n)");
	private JTextField tfH = new JTextField();
	private JTextField tfB = new JTextField();
	private JTextField tfQ = new JTextField();
	private JTextField tfC = new JTextField();
	private JTextField tfEnd = new JTextField();
	private JTextField tfNome = new JTextField();
	private JTextField tfVal = new JTextField();
	private JTextField tfEle = new JTextField();
	private JTextField tfCon = new JTextField();
	private JTextField tfVar = new JTextField();
	private JTextField tfAnd = new JTextField();
	private JTextField tfPis = new JTextField();

	private static ControlApartamento cta;

	public void CadastroCasa() {
		qtdH.setBounds(20, 10, 150, 20);
		tfH.setBounds(20, 30, 150, 20);
		qtdB.setBounds(20, 50, 150, 20);
		tfB.setBounds(20, 70, 150, 20);
		qtdQ.setBounds(20, 90, 150, 20);
		tfQ.setBounds(20, 110, 150, 20);
		qtdC.setBounds(20, 130, 150, 20);
		tfC.setBounds(20, 150, 150, 20);
		end.setBounds(20, 170, 150, 20);
		tfEnd.setBounds(20, 190, 150, 20);
		nome.setBounds(250, 10, 150, 20);
		tfNome.setBounds(250, 30, 150, 20);
		val.setBounds(250, 50, 150, 20);
		tfVal.setBounds(250, 70, 150, 20);
		and.setBounds(250, 90, 150, 20);
		tfAnd.setBounds(250, 110, 150, 20);
		pis.setBounds(250, 130, 150, 20);
		tfPis.setBounds(250, 150, 150, 20);

		salvarCs.setBounds(270, 190, 100, 30);

		janela.setSize(500, 300);
		janela.setVisible(true);
		janela.add(qtdH);
		janela.add(qtdB);
		janela.add(qtdQ);
		janela.add(qtdC);
		janela.add(end);
		janela.add(nome);
		janela.add(val);
		janela.add(pis);
		janela.add(and);

		janela.add(tfH);
		janela.add(tfB);
		janela.add(tfQ);
		janela.add(tfC);
		janela.add(tfEnd);
		janela.add(tfNome);
		janela.add(tfVal);
		janela.add(tfPis);
		janela.add(tfAnd);

		janela.add(salvarCs);

		janela.setLayout(null);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void CadastroApartamento() {

		qtdH.setBounds(20, 10, 150, 20);
		tfH.setBounds(20, 30, 150, 20);
		qtdB.setBounds(20, 50, 150, 20);
		tfB.setBounds(20, 70, 150, 20);
		qtdQ.setBounds(20, 90, 150, 20);
		tfQ.setBounds(20, 110, 150, 20);
		qtdC.setBounds(20, 130, 150, 20);
		tfC.setBounds(20, 150, 150, 20);
		end.setBounds(20, 170, 150, 20);
		tfEnd.setBounds(20, 190, 150, 20);
		nome.setBounds(250, 10, 150, 20);
		tfNome.setBounds(250, 30, 150, 20);
		val.setBounds(250, 50, 150, 20);
		tfVal.setBounds(250, 70, 150, 20);
		ele.setBounds(250, 90, 150, 20);
		tfEle.setBounds(250, 110, 150, 20);
		con.setBounds(250, 130, 150, 20);
		tfCon.setBounds(250, 150, 150, 20);
		var.setBounds(250, 170, 150, 20);
		tfVar.setBounds(250, 190, 150, 20);
		salvarAp.setBounds(160, 220, 100, 30);

		janela.setSize(500, 300);
		janela.setVisible(true);
		janela.add(qtdH);
		janela.add(qtdB);
		janela.add(qtdQ);
		janela.add(qtdC);
		janela.add(end);
		janela.add(nome);
		janela.add(val);
		janela.add(ele);
		janela.add(var);
		janela.add(con);
		janela.add(tfH);
		janela.add(tfB);
		janela.add(tfQ);
		janela.add(tfC);
		janela.add(tfEnd);
		janela.add(tfNome);
		janela.add(tfVal);
		janela.add(tfEle);
		janela.add(tfVar);
		janela.add(tfCon);
		janela.add(salvarAp);
		
		salvarAp.addActionListener(this);
		salvarCs.addActionListener(this);

		janela.setLayout(null);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void CadastrarApt() {
		
		
		String sqtdHospedes = tfH.getText();
		int qtdHospedes = Integer.parseInt(sqtdHospedes);
		String sqtdQuartos = tfQ.getText();
		int qtdQuartos = Integer.parseInt(sqtdQuartos);
		String sqtdCamas = tfC.getText();
		int qtdCamas = Integer.parseInt(sqtdCamas);
		String sqtdBanheiros = tfB.getText();
		int qtdBanheiros = Integer.parseInt(sqtdBanheiros);
		String endereco = tfEnd.getText();
		String nome = tfNome.getText();
		String sValor = tfVal.getText();
		double valor = Double.parseDouble(sValor);
		String sElevador = tfEle.getText();
		char elevador = sElevador.charAt(0);
		String sCondominio = tfCon.getText();
		char condominio = sCondominio.charAt(0);
		String sVaranda = tfVar.getText();
		char varanda = sVaranda.charAt(0);

		Apartamento ap = new Apartamento(nome, endereco, valor, qtdHospedes, qtdBanheiros, qtdCamas, qtdQuartos,
				elevador, varanda, condominio);

		cta.cadastraApartamento(ap);

		JOptionPane.showMessageDialog(null, "Apartamento cadastrado com sucesso");

		tfNome.setText("");
		tfEnd.setText("");
		tfQ.setText("");
		tfC.setText("");
		tfB.setText("");
		tfH.setText("");
		tfEle.setText("");
		tfCon.setText("");
		tfVal.setText("");
		tfVar.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == salvarAp) {
			CadastrarApt();
			//new TelaMenu();
		}

	}

}
