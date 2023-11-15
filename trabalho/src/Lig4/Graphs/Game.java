package Lig4.Graphs;

import Lig4.Jogo.*;
import Lig4.Opcoes.*;

import java.awt.EventQueue;
import java.io.IOException;
import javax.imageio.ImageIO;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class Game {

	private JFrame frame;
	private JTextField entrada;
	
	private ModoNormal normal = new ModoNormal();
	private ModoTurbo turbo = new ModoTurbo();
	private ModoTurboMaluco turboMaluco = new ModoTurboMaluco();
	
	private int colunaEscolhida, modo;
	private int auxiliar;
	
	private Ranking auxRanking;
	
	private ImageIcon img1 = new ImageIcon(this.getClass().getResource("/board_-_Copia_2_520x300.png"));
	private ImageIcon img2 = new ImageIcon(this.getClass().getResource("/piece_1_46x47.png"));
	private ImageIcon img3 = new ImageIcon(this.getClass().getResource("/piece_blue_46x47.png"));
	
	private String vermelho, azul;

	JLabel nivelMaluquice = new JLabel("");
	
	//Peças:
	
	private JLabel piece00 = new JLabel("");
	private JLabel piece01 = new JLabel("");
	private JLabel piece02 = new JLabel("");
	private JLabel piece03 = new JLabel("");
	private JLabel piece04 = new JLabel("");
	private JLabel piece05 = new JLabel("");
	private JLabel piece06 = new JLabel("");
	private JLabel piece10 = new JLabel("");
	private JLabel piece11 = new JLabel("");
	private JLabel piece12 = new JLabel("");
	private JLabel piece13 = new JLabel("");
	private JLabel piece14 = new JLabel("");
	private JLabel piece15 = new JLabel("");
	private JLabel piece16 = new JLabel("");
	private JLabel piece20 = new JLabel("");
	private JLabel piece21 = new JLabel("");
	private JLabel piece22 = new JLabel("");
	private JLabel piece23 = new JLabel("");
	private JLabel piece24 = new JLabel("");
	private JLabel piece25 = new JLabel("");
	private JLabel piece26 = new JLabel("");
	private JLabel piece30 = new JLabel("");
	private JLabel piece31 = new JLabel("");
	private JLabel piece32 = new JLabel("");
	private JLabel piece33 = new JLabel("");
	private JLabel piece34 = new JLabel("");
	private JLabel piece35 = new JLabel("");
	private JLabel piece36 = new JLabel("");
	private JLabel piece40 = new JLabel("");
	private JLabel piece41 = new JLabel("");
	private JLabel piece42 = new JLabel("");
	private JLabel piece43 = new JLabel("");
	private JLabel piece44 = new JLabel("");
	private JLabel piece45 = new JLabel("");
	private JLabel piece46 = new JLabel("");
	private JLabel piece50 = new JLabel("");
	private JLabel piece51 = new JLabel("");
	private JLabel piece52 = new JLabel("");
	private JLabel piece53 = new JLabel("");
	private JLabel piece54 = new JLabel("");
	private JLabel piece55 = new JLabel("");
	private JLabel piece56 = new JLabel("");
	
	private JLabel board[][] = new JLabel[6][7];
	
	public void showJogo () {
		frame.setVisible(true);
	}
	
	public Game(int modo, String vermelho, String azul, Ranking auxRanking) {
		super();
		this.modo = modo;
		this.vermelho = vermelho;
		this.azul = azul;
		this.auxRanking = auxRanking;
		initialize();
	}

	private void initialize() {	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 239, 213));
		frame.getContentPane().setLayout(null);
		frame.setSize(600,400);
		
		JLabel lblNewLabel = new JLabel("Vermelho:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(27, 12, 69, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAzul = new JLabel("Azul:");
		lblAzul.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAzul.setBounds(433, 12, 46, 14);
		frame.getContentPane().add(lblAzul);
		
		JLabel lblNewLabel_1 = new JLabel(normal.getPontuacaoVermelho() + " pts.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(96, 12, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(normal.getPontuacaoAzul() + " pts.");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_1_1.setBounds(470, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(img1);
		lblNewLabel_2.setBounds(20, 36, 520, 300);
		frame.getContentPane().add(lblNewLabel_2);
		
		piece00.setBounds(44, 44, 46, 47);
		frame.getContentPane().add(piece00);
		
		piece01.setBounds(115, 44, 46, 47);
		frame.getContentPane().add(piece01);
		piece02.setBounds(186, 44, 46, 47);
		frame.getContentPane().add(piece02);
		
		piece03.setBounds(257, 44, 46, 47);
		frame.getContentPane().add(piece03);
		
		piece04.setBounds(327, 44, 46, 47);
		frame.getContentPane().add(piece04);
		
		piece06.setBounds(470, 44, 46, 47);
		frame.getContentPane().add(piece06);
		
		piece05.setBounds(401, 44, 46, 47);
		frame.getContentPane().add(piece05);
		
		piece10.setBounds(44, 89, 46, 47);
		frame.getContentPane().add(piece10);
		
		piece11.setBounds(115, 89, 46, 47);
		frame.getContentPane().add(piece11);
		
		piece12.setBounds(186, 89, 46, 47);
		frame.getContentPane().add(piece12);
		
		piece13.setBounds(257, 89, 46, 47);
		frame.getContentPane().add(piece13);
		
		piece14.setBounds(327, 89, 46, 47);
		frame.getContentPane().add(piece14);
		
		piece16.setBounds(470, 89, 46, 47);
		frame.getContentPane().add(piece16);
		
		piece15.setBounds(401, 89, 46, 47);
		frame.getContentPane().add(piece15);
		
		piece20.setBounds(44, 138, 46, 47);
		frame.getContentPane().add(piece20);
		
		piece21.setBounds(115, 138, 46, 47);
		frame.getContentPane().add(piece21);
		
		piece22.setBounds(186, 138, 46, 47);
		frame.getContentPane().add(piece22);
		
		piece23.setBounds(257, 138, 46, 47);
		frame.getContentPane().add(piece23);
		
		piece24.setBounds(327, 138, 46, 47);
		frame.getContentPane().add(piece24);
		
		piece26.setBounds(470, 138, 46, 47);
		frame.getContentPane().add(piece26);
		
		piece25.setBounds(401, 138, 46, 47);
		frame.getContentPane().add(piece25);
		
		piece30.setBounds(44, 185, 46, 47);
		frame.getContentPane().add(piece30);
		
		piece31.setBounds(115, 185, 46, 47);
		frame.getContentPane().add(piece31);
		
		piece32.setBounds(186, 185, 46, 47);
		frame.getContentPane().add(piece32);
		
		piece33.setBounds(257, 185, 46, 47);
		frame.getContentPane().add(piece33);
		
		piece34.setBounds(327, 185, 46, 47);
		frame.getContentPane().add(piece34);
		
		piece36.setBounds(470, 185, 46, 47);
		frame.getContentPane().add(piece36);
		
		piece35.setBounds(401, 185, 46, 47);
		frame.getContentPane().add(piece35);
		
		piece40.setBounds(44, 232, 46, 47);
		frame.getContentPane().add(piece40);
		
		piece41.setBounds(115, 232, 46, 47);
		frame.getContentPane().add(piece41);
		
		piece42.setBounds(186, 232, 46, 47);
		frame.getContentPane().add(piece42);
		
		piece43.setBounds(257, 232, 46, 47);
		frame.getContentPane().add(piece43);
		
		piece44.setBounds(327, 232, 46, 47);
		frame.getContentPane().add(piece44);
		
		piece46.setBounds(470, 232, 46, 47);
		frame.getContentPane().add(piece46);
		
		piece45.setBounds(401, 232, 46, 47);
		frame.getContentPane().add(piece45);
		
		piece50.setBounds(44, 278, 46, 47);
		frame.getContentPane().add(piece50);
		
		piece51.setBounds(115, 278, 46, 47);
		frame.getContentPane().add(piece51);
		
		piece52.setBounds(186, 278, 46, 47);
		frame.getContentPane().add(piece52);
		
		piece53.setBounds(257, 278, 46, 47);
		frame.getContentPane().add(piece53);
		
		piece54.setBounds(327, 278, 46, 47);
		frame.getContentPane().add(piece54);
		
		piece56.setBounds(470, 278, 46, 47);
		frame.getContentPane().add(piece56);
		
		piece55.setBounds(401, 278, 46, 47);
		frame.getContentPane().add(piece55);
		
		entrada = new JTextField();
		entrada.setBounds(193, 10, 76, 20);
		frame.getContentPane().add(entrada);
		entrada.setColumns(10);
		
		turboMaluco.nivelDeMaluquice(); //mudar geracao nivel de maluquice
		
		JLabel lblNewLabel_3 = new JLabel("Coluna:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(140, 12, 54, 14);
		frame.getContentPane().add(lblNewLabel_3);	
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (modo == 1) { //Normal
						auxiliar = 0;
						try {
							colunaEscolhida = Integer.parseInt(entrada.getText());
							auxiliar = 1;
						} catch (Exception er) {
							auxiliar = 0;
						}
						if (auxiliar != 0) {
							colunaEscolhida = Integer.parseInt(entrada.getText());
							if(normal.getJogada() == 42) {
								auxRanking.addRanking(vermelho, azul, Integer.toString(normal.getPontuacaoVermelho()), Integer.toString(normal.getPontuacaoAzul()));
								MenuPrincipal menu = new MenuPrincipal(auxRanking);
								frame.setVisible(false);
								menu.showMenu();							
							} else {
								if (colunaEscolhida < 8 && colunaEscolhida > 0) {
									if (normal.getLinha(colunaEscolhida-1) < 6) {
										normal.peca(colunaEscolhida);
										addPeca(normal.getPeca(normal.getLinha(colunaEscolhida-1), colunaEscolhida-1),normal.getLinha(colunaEscolhida-1),colunaEscolhida-1);
										normal.jogar(colunaEscolhida);
										lblNewLabel_1.setText(normal.getPontuacaoVermelho() + " pts.");
										lblNewLabel_1_1.setText(normal.getPontuacaoAzul() + " pts.");

									}
								}
							}	
						}
				} else if (modo == 2) { //Turbo
					auxiliar = 0;
					try {
						colunaEscolhida = Integer.parseInt(entrada.getText());
						auxiliar = 1;
					} catch (Exception er) {
						auxiliar = 0;
					}
					if (auxiliar != 0) {
						if (turbo.getJogada() == 42 ) {
							auxRanking.addRanking(vermelho, azul, Integer.toString(normal.getPontuacaoVermelho()), Integer.toString(normal.getPontuacaoAzul()));
							MenuPrincipal menu = new MenuPrincipal(auxRanking);
							frame.setVisible(false);
							menu.showMenu();	
						} else {
							if (colunaEscolhida < 8 && colunaEscolhida > 0) {
								if (turbo.getLinha(colunaEscolhida-1) < 6) {
									turbo.peca(colunaEscolhida);
									addPeca(turbo.getPeca(turbo.getLinha(colunaEscolhida-1), colunaEscolhida-1),turbo.getLinha(colunaEscolhida-1),colunaEscolhida-1);
									if(turbo.getModoTurbo(0) != 0 || turbo.getModoTurbo(0) != 1) {
										turbo(turbo.getLinha(colunaEscolhida-1), colunaEscolhida);
									}
									turbo.jogar(colunaEscolhida);
									lblNewLabel_1.setText(turbo.getPontuacaoVermelho() + " pts.");
									lblNewLabel_1_1.setText(turbo.getPontuacaoAzul() + " pts.");
								} else {
									
								}
							}
						}
					}
				} else if (modo == 3) { //Turbo Maluco
					nivelMaluquice.setText("NM = " + turboMaluco.getNivelDeMaluquice());
					auxiliar = 0;
					try {
						colunaEscolhida = Integer.parseInt(entrada.getText());
						auxiliar = 1;
					} catch (Exception er) {
						auxiliar = 0;
					}
					if (auxiliar != 0) {
						if (turboMaluco.getJogada() == 42) {
							auxRanking.addRanking(vermelho, azul, Integer.toString(normal.getPontuacaoVermelho()), Integer.toString(normal.getPontuacaoAzul()));
							MenuPrincipal menu = new MenuPrincipal(auxRanking);
							frame.setVisible(false);
							menu.showMenu();
						} else {
							if (colunaEscolhida < 8 && colunaEscolhida > 0) {
								if (turboMaluco.getLinha(colunaEscolhida-1) < 6) {
									turboMaluco.peca(colunaEscolhida);
									addPeca(turboMaluco.getPeca(turboMaluco.getLinha(colunaEscolhida-1), colunaEscolhida-1),turboMaluco.getLinha(colunaEscolhida-1),colunaEscolhida-1);
									turboMaluco(turboMaluco.getLinha(colunaEscolhida-1), colunaEscolhida);
									turboMaluco.jogar(colunaEscolhida);
									lblNewLabel_1.setText(turboMaluco.getPontuacaoVermelho() + " pts.");
									lblNewLabel_1_1.setText(turboMaluco.getPontuacaoAzul() + " pts.");
								} else {
									
								}
							}
						}
					}
				}
							
			}
			
		});
		btnNewButton.setBounds(279, 9, 54, 23);
		frame.getContentPane().add(btnNewButton);
		
		nivelMaluquice.setFont(new Font("Tahoma", Font.BOLD, 13));
		nivelMaluquice.setBounds(343, 12, 69, 14);
		frame.getContentPane().add(nivelMaluquice);
		frame.setBounds(100, 100, 590, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	public void addPeca(int i, int linha, int coluna) {
		
		board[5][0] = piece00;
		board[5][1] = piece01;
		board[5][2] = piece02;
		board[5][3] = piece03;
		board[5][4] = piece04;
		board[5][5] = piece05;
		board[5][6] = piece06;
		board[4][0] = piece10;
		board[4][1] = piece11;
		board[4][2] = piece12;
		board[4][3] = piece13;
		board[4][4] = piece14;
		board[4][5] = piece15;
		board[4][6] = piece16;
		board[3][0] = piece20;
		board[3][1] = piece21;
		board[3][2] = piece22;
		board[3][3] = piece23;
		board[3][4] = piece24;
		board[3][5] = piece25;
		board[3][6] = piece26;
		board[2][0] = piece30;
		board[2][1] = piece31;
		board[2][2] = piece32;
		board[2][3] = piece33;
		board[2][4] = piece34;
		board[2][5] = piece35;
		board[2][6] = piece36;
		board[1][0] = piece40;
		board[1][1] = piece41;
		board[1][2] = piece42;
		board[1][3] = piece43;
		board[1][4] = piece44;
		board[1][5] = piece45;
		board[1][6] = piece46;
		board[0][0] = piece50;
		board[0][1] = piece51;
		board[0][2] = piece52;
		board[0][3] = piece53;
		board[0][4] = piece54;
		board[0][5] = piece55;
		board[0][6] = piece56;
		
		if(i == 1) {
			board[linha][coluna].setIcon(img2);
		} else if (i == 2) {
			board[linha][coluna].setIcon(img3);
		}
	}
	
	public void turbo(int linha, int colunas) {
	if (turbo.getModoTurbo(0) == 1) {
		if (turbo.getPeca(linha, colunas-1) == 1) {
			board[linha][colunas - 2].setIcon(img2);
		} else {
			board[linha][colunas - 2].setIcon(img3);
		}
	} 

	if (turbo.getModoTurbo(1) == 2) {
		if (turbo.getPeca(linha, colunas-1) == 1) {
			board[linha][colunas].setIcon(img2);
		} else {
			board[linha][colunas].setIcon(img3);
		}
	  }
	}
	
	public void turboMaluco(int linha, int colunas) {
		if (turboMaluco.getModoTurboMaluco(0) == 1) {
			if (turboMaluco.getPeca(linha, colunas-1) == 1) {
				board[linha][colunas - 2].setIcon(img2);
			} else {
				board[linha][colunas - 2].setIcon(img3);
			}
		} 
		if (turboMaluco.getModoTurboMaluco(1) == 1) {
			if (turboMaluco.getPeca(linha, colunas-1) == 1) {
				board[linha][colunas].setIcon(img2);
			} else { 
				board[linha][colunas].setIcon(img3);
			}
		} 
		if (turboMaluco.getModoTurboMaluco(2) == 1) {
			if (turboMaluco.getPeca(linha, colunas-1) == 1) {
				board[linha-1][colunas-1].setIcon(img2);
			} else {
				board[linha-1][colunas-1].setIcon(img3);
			}
		}
		if (turboMaluco.getModoTurboMaluco(3) == 1) {
			if (turboMaluco.getPeca(linha, colunas-1) == 1) {
				board[linha+1][colunas].setIcon(img2);
			} else {
				board[linha+1][colunas].setIcon(img3);
			}
		}
		if (turboMaluco.getModoTurboMaluco(4) == 1) {
			if (turboMaluco.getPeca(linha, colunas-1) == 1) {
				board[linha+1][colunas - 2].setIcon(img2);
			} else {
				board[linha+1][colunas - 2].setIcon(img3);
			}
		} 
		if (turboMaluco.getModoTurboMaluco(5) == 1) {
			if (turboMaluco.getPeca(linha, colunas-1) == 1) {
				board[linha-1][colunas - 2].setIcon(img2);
			} else {
				board[linha-1][colunas - 2].setIcon(img3);
			}
		} 
		if (turboMaluco.getModoTurboMaluco(6) == 1) {
			if (turboMaluco.getPeca(linha, colunas-1) == 1) {
				board[linha-1][colunas].setIcon(img2);
			} else {
				board[linha-1][colunas].setIcon(img3);
			}
		}
	}
}
