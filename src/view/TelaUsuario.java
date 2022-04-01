package view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import control.ControleDados;
import control.ControleUsuario;
import model.Dados;
import model.Usuario;

public class TelaUsuario {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroUsuario;
	private JButton refreshUsuario;
	private static ControleDados dados;
	private JList<String> listaUsuariosCadastrados;
	private String[] listaNomes = new String[50];

	public TelaUsuario(ControleDados d) {
		
		dados = d;
		listaNomes = new ControleUsuario(dados).listarNomes();
		listaUsuariosCadastrados = new JList<String>(listaNomes);
		
		janela = new JFrame("Tela Usuario");
		titulo = new JLabel("Usuarios Cadastrados");
		cadastroUsuario = new JButton("Cadastrar");
		refreshUsuario = new JButton("Refresh");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);
		listaUsuariosCadastrados.setBounds(20, 50, 350, 120);
		listaUsuariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaUsuariosCadastrados.setVisibleRowCount(10);
		
		cadastroUsuario.setBounds(70, 177, 100, 30);
		refreshUsuario.setBounds(200, 177, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaUsuariosCadastrados);
		janela.add(cadastroUsuario);
		janela.add(refreshUsuario);

		janela.setSize(400, 250);
		janela.setVisible(true);

	}
}