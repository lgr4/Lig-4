package Lig4.Graphs;

import Lig4.Opcoes.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class RankingScreen {

	private JFrame frame;

	private Ranking ranking;
	
	private JLabel arrayColocacoes[] = new JLabel[10];
	
	JLabel primeiro = new JLabel("");
	JLabel segundo = new JLabel("");
	JLabel terceiro = new JLabel("");
	JLabel quarto = new JLabel("");
	JLabel quinto = new JLabel("");
	JLabel sexto = new JLabel("");
	JLabel setimo = new JLabel("");
	JLabel oitavo = new JLabel("");
	JLabel nono = new JLabel("");
	JLabel decimo = new JLabel("");
	
	public void showRanking () {
		frame.setVisible(true);
	}

	public RankingScreen(Ranking ranking) {
		this.ranking = ranking;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MenuPrincipal menu = new MenuPrincipal(ranking);
				menu.showMenu();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(168, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
		primeiro.setFont(new Font("Tahoma", Font.BOLD, 13));

		primeiro.setBounds(47, 36, 142, 14);
		frame.getContentPane().add(primeiro);
		segundo.setFont(new Font("Tahoma", Font.BOLD, 13));

		segundo.setBounds(47, 64, 142, 14);
		frame.getContentPane().add(segundo);
		terceiro.setFont(new Font("Tahoma", Font.BOLD, 13));

		terceiro.setBounds(47, 87, 142, 14);
		frame.getContentPane().add(terceiro);
		quarto.setFont(new Font("Tahoma", Font.BOLD, 13));

		quarto.setBounds(47, 116, 142, 14);
		frame.getContentPane().add(quarto);
		quinto.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		quinto.setBounds(47, 151, 142, 14);
		frame.getContentPane().add(quinto);
		sexto.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		sexto.setBounds(254, 36, 149, 14);
		frame.getContentPane().add(sexto);
		setimo.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		setimo.setBounds(254, 64, 149, 14);
		frame.getContentPane().add(setimo);
		oitavo.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		oitavo.setBounds(254, 87, 149, 14);
		frame.getContentPane().add(oitavo);
		nono.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		nono.setBounds(254, 116, 149, 14);
		frame.getContentPane().add(nono);
		decimo.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		decimo.setBounds(254, 151, 149, 14);
		frame.getContentPane().add(decimo);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gerarRanking();
		
	}
	
	public void gerarRanking() {
		
		arrayColocacoes[0] = primeiro;
		arrayColocacoes[1] = segundo;
		arrayColocacoes[2] = terceiro;
		arrayColocacoes[3] = quarto;
		arrayColocacoes[4] = quinto;
		arrayColocacoes[5] = sexto;
		arrayColocacoes[6] = setimo;
		arrayColocacoes[7] = oitavo;
		arrayColocacoes[8] = nono;
		arrayColocacoes[9] = decimo;
		
		for(int k = 0; k < ranking.getRankingSize(); k++) {
			arrayColocacoes[k].setText((k+1) + ". " + ranking.getPlayersRanking(ranking.getRankingSize() -k-1) + " - " + ranking.getPlayersPoints(ranking.getRankingSize() -k-1) + " pontos");
		}		
	}
}
