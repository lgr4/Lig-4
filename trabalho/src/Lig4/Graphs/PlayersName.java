package Lig4.Graphs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Lig4.Opcoes.Ranking;


public class PlayersName{
	
	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private int modo;
	/**
	 * Launch the application.
	 */
	
	private Ranking auxRanking;
	
	String vermelho, azul;
	
	public PlayersName(int modo, Ranking auxRanking) {
		this.modo = modo;
		this.auxRanking = auxRanking;
		initialize();
	}
	
	public void showPlayersNameWindow () {
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.setBounds(100, 100, 503, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(109, 93, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.text);
		textField.setBounds(150, 91, 183, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(109, 156, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 154, 183, 20);
		frame.getContentPane().add(textField_1);
		
		lblNewLabel_2 = new JLabel("Vermelho");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(202, 67, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Azul");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(219, 129, 28, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vermelho = textField.getText();
				azul = textField_1.getText();
				frame.setVisible(false);
				Game lig4 = new Game(modo, textField.getText(), textField_1.getText(), auxRanking);
				lig4.showJogo();
			}
		});
		btnNewButton.setBounds(191, 188, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	public String getNomeVermelho () {
		return vermelho;
	}
	
	public String getNomeAzul () {
		return azul;
	}
}
