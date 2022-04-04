package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;


import control.ControleUsuario;

import model.Usuario;

public class TelaUsuario {

	private JFrame janela = new JFrame();
	private JLabel t = new JLabel("Cadastrar Usuario");
	private JLabel n = new JLabel("Nome");
	private JLabel c = new JLabel("CPF");
	private JLabel e = new JLabel("Email");
	private JLabel tel = new JLabel("Telefone");
	private JLabel end = new JLabel("Endereco");
	
	private JTextField nome = new JTextField();
	private JTextField cpf = new JTextField();;
	private JTextField email = new JTextField();
	private JTextField telefone = new JTextField();
	private JTextField endereco = new JTextField();
	private JButton salvar = new JButton("Salvar");
	private JButton verTodos = new JButton("Lista");
	ControleUsuario ctu = new ControleUsuario();
	
	

	public TelaUsuario() {
		t.setBounds(130, 20, 200, 20);
		
		n.setBounds(10, 50,100, 20);
		c.setBounds(10, 80, 100, 20);
		e.setBounds(10, 110, 100, 20);
		tel.setBounds(10, 140, 100, 20);
		end.setBounds(10, 170, 100, 20);
		
		nome.setBounds(70, 50, 100, 20);
		cpf.setBounds(70, 80, 100, 20);
		email.setBounds(70, 110, 100, 20);
		endereco.setBounds(70, 170, 100, 20);
		telefone.setBounds(70, 140, 100, 20);
		
		
		salvar.setBounds(70, 200, 90, 30);
		verTodos.setBounds(200, 100, 100, 50);
		
		
		janela.setSize(400, 300);
		janela.setVisible(true);
		janela.add(nome);
		janela.add(cpf);
		janela.add(email);
		janela.add(t);
		janela.add(c);
		janela.add(e);
		janela.add(n);
		janela.add(tel);
		janela.add(end);
		janela.add(telefone);
		janela.add(endereco);
		
		janela.add(salvar);
		janela.add(verTodos);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
}
	
	public void salvarActionPerfomed(ActionEvent e) {
		Usuario usuario = new Usuario();
		
		usuario.setNome(nome.getText());
		usuario.setCpf(cpf.getText());
		usuario.setEmail(email.getText());
		usuario.setEndereco(endereco.getText());
		usuario.setTelefone(telefone.getText());
		usuario.setNome(salvar.getText());
		
		if(ctu.cadastrarUsuario(usuario)) {
			JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso");
		}
	}
		
		public void listar() {
			ArrayList<Usuario> usuarios = ctu.listarUsuarios();
		}
		
	}
