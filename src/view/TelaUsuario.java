package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleUsuario;

import model.Usuario;

public class TelaUsuario implements ActionListener, ListSelectionListener {

	private JFrame janela = new JFrame();
	private JLabel t = new JLabel("Cadastrar Usuario");
	private JLabel n = new JLabel("Nome");
	private JLabel c = new JLabel("CPF");
	private JLabel e = new JLabel("Email");
	private JLabel tel = new JLabel("Telefone");
	private JLabel end = new JLabel("Endereco");
	private JLabel numUsersCadastrados = new JLabel();

	private JTextField tfNome = new JTextField();
	private JTextField tfCpf = new JTextField();;
	private JTextField tfEmail = new JTextField();
	private JTextField tfTelefone = new JTextField();
	private JTextField tfEndereco = new JTextField();
	private JButton salvar = new JButton("Salvar");
	private JButton excluir = new JButton("Excluir");
	private JButton alterar = new JButton("Alterar");

	private JList<String> listaUsuariosCadastrados = new JList<String>();

	private static ControleUsuario ctu;
	int i;

	public void Tela(ControleUsuario cont) {
		ctu = cont;

		listaUsuariosCadastrados.setListData(ctu.getListaNomes());
		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(220, 50, 250, 250);
		t.setBounds(130, 20, 200, 20);

		n.setBounds(10, 50, 100, 20);
		c.setBounds(10, 80, 100, 20);
		e.setBounds(10, 110, 100, 20);
		tel.setBounds(10, 140, 100, 20);
		end.setBounds(10, 170, 100, 20);

		tfNome.setBounds(70, 50, 100, 20);
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
		janela.add(tfNome);
		janela.add(tfCpf);
		janela.add(tfEmail);
		janela.add(t);
		janela.add(c);
		janela.add(e);
		janela.add(n);
		janela.add(tel);
		janela.add(end);
		janela.add(numUsersCadastrados);
		janela.add(tfTelefone);
		janela.add(tfEndereco);

		janela.add(salvar);
		janela.add(excluir);
		janela.add(alterar);

		janela.setLayout(null);
		//janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.add(scrollPane);

		salvar.addActionListener(this);
		excluir.addActionListener(this);

		listaUsuariosCadastrados.addListSelectionListener(this);

		scrollPane.setViewportView(listaUsuariosCadastrados);

	}

	// Funcao que cadastra Usuario
	public void salvarUsuario() {
		String nome = tfNome.getText();
		String cpf = tfCpf.getText();
		String email = tfEmail.getText();
		String end = tfEndereco.getText();
		String tel = tfTelefone.getText();

		Usuario u = new Usuario(nome, cpf, email, end, tel);

		ctu.cadastraUsuario(u);

		numUsersCadastrados.setText(ctu.numeroDeUsuarios());

		JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
		
		tfNome.setText("");
		tfCpf.setText("");
		tfEmail.setText("");
		tfEndereco.setText("");
		tfTelefone.setText("");

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == salvar) {
			salvarUsuario();
			listaUsuariosCadastrados.setListData(ctu.getListaNomes());
			listaUsuariosCadastrados.updateUI();
			new TelaMenu();
		}
		if (src == excluir) {
			
			if (i >= 0 ) {
				ctu.listarUsuarios().remove(i);
				listaUsuariosCadastrados.setListData(ctu.getListaNomes());
				listaUsuariosCadastrados.updateUI();

			}
			
		}
		if (src == alterar) {

		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (src == listaUsuariosCadastrados) {
			i = listaUsuariosCadastrados.getSelectedIndex();
			
			
		}

	}

}
