package Lig4.Graphs;

import java.awt.EventQueue;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Lig4.Opcoes.Ranking;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MenuPrincipal {
	
	private Ranking auxRanking;
	int modo;
	
	private JFrame frame;
	
	public MenuPrincipal(Ranking auxRanking) {
		this.auxRanking = auxRanking;
		initialize();
	}
	
	
	public void showMenu () {
		frame.setVisible(true);
	}
	
	private void initialize() {
		if (auxRanking.getRankingSize() > 0) {
			System.out.println(auxRanking.getPlayersRanking(0));
		}
		
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(255, 239, 213));
		frame.setBounds(100, 100, 587, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Modo Normal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				modo = 1;
				PlayersName nomeJogadores = new PlayersName(modo, auxRanking);
				nomeJogadores.showPlayersNameWindow();
			}
		});
		btnNewButton.setBackground(new Color(248, 223, 173));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(203, 29, 147, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnModoTurbo = new JButton("Modo Turbo");
		btnModoTurbo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModoTurbo.setBackground(new Color(248, 223, 173));
		btnModoTurbo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				modo = 2;
				PlayersName nomeJogadores = new PlayersName(modo, auxRanking);
				nomeJogadores.showPlayersNameWindow();
			}
		});
		btnModoTurbo.setBounds(203, 108, 147, 51);
		frame.getContentPane().add(btnModoTurbo);
		
		JButton btnModoTurboMaluco = new JButton("Modo Turbo Maluco");
		btnModoTurboMaluco.setBackground(new Color(248, 223, 173));
		btnModoTurboMaluco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModoTurboMaluco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				modo = 3;
				PlayersName nomeJogadores = new PlayersName(modo, auxRanking);
				nomeJogadores.showPlayersNameWindow();
			}
		});
		btnModoTurboMaluco.setBounds(203, 191, 147, 51);
		frame.getContentPane().add(btnModoTurboMaluco);
		
		JButton btnRanking = new JButton("Ranking");
		btnRanking.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRanking.setBackground(new Color(248, 223, 173));
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			RankingScreen telaRanking = new RankingScreen(auxRanking);
			telaRanking.showRanking();	
			}
		});
		btnRanking.setBounds(203, 271, 147, 51);
		frame.getContentPane().add(btnRanking);
	}
	
	public int getModo () {
		return modo;
	}
}
