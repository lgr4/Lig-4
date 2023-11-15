package Lig4.Jogo;

public abstract class Jogo {
	
	private Jogador vermelho = new Jogador();
	
	private Jogador azul = new Jogador();
	
	
	
	public Jogo () {
		
	}
	
	//Métodos get:
	
	public int getPontuacaoVermelho() {
		return vermelho.getPontuacao();
	}
	
	public int getPontuacaoAzul() {
		return azul.getPontuacao();
	}
	
	//Método que avalia se o jogador ligou quatro peças:
	
	/*Ao marcar o ponto, os quatro espacos conectados são travados. O principal objetivo disso é 
	  evitar a retirada de pontos no modo turbo.*/
	
	//tabuleiro[linhas][colunas-1]
	
	public void avaliacao (int colunas, int linha, int[][] tabuleiro) {
		
		if (colunas >= 3) { //<-
			if (colunas < 7 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 1][colunas]) { // o o O o (1 peça antes da esquerda)
				if (tabuleiro[linha - 1][colunas] == tabuleiro[linha - 1][colunas - 1] && tabuleiro[linha - 1][colunas] == tabuleiro[linha - 1][colunas - 2] && tabuleiro[linha - 1][colunas] == tabuleiro[linha - 1][colunas - 3]) {
					if (tabuleiro[linha - 1][colunas - 1] == 1) {

						
						vermelho.aumentarPontuacao();
						
						tabuleiro[linha - 1][colunas] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;
						tabuleiro[linha - 1][colunas - 2] = 3;
						tabuleiro[linha - 1][colunas - 3] = 3;
					} else if (tabuleiro[linha - 1][colunas - 1] == 2) {

						azul.aumentarPontuacao();

						tabuleiro[linha - 1][colunas] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;
						tabuleiro[linha - 1][colunas - 2] = 3;
						tabuleiro[linha - 1][colunas - 3] = 3;
					}
				}
			} else if (colunas >= 4 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 1][colunas - 2] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 1][colunas - 3] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 1][colunas - 4]) {
				if (tabuleiro[linha - 1][colunas - 1] == 1) {

					vermelho.aumentarPontuacao();
	
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 1][colunas - 2] = 3;
					tabuleiro[linha - 1][colunas - 3] = 3;
					tabuleiro[linha - 1][colunas - 4] = 3;
				} else if (tabuleiro[linha - 1][colunas - 1] == 2) {

					azul.aumentarPontuacao();

					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 1][colunas - 2] = 3;
					tabuleiro[linha - 1][colunas - 3] = 3;
					tabuleiro[linha - 1][colunas - 4] = 3;
				}
			}
		} 
		
		if (colunas <= 5) { // ->
			if (colunas > 1 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 1][colunas - 2]) { // o O o o
				if (tabuleiro[linha - 1][colunas - 2] == tabuleiro[linha - 1][colunas - 1] && tabuleiro[linha - 1][colunas - 2] == tabuleiro[linha - 1][colunas] && tabuleiro[linha - 1][colunas - 2] == tabuleiro[linha - 1][colunas + 1]) {
					if (tabuleiro[linha - 1][colunas - 1] == 1) {

						vermelho.aumentarPontuacao();
						
						tabuleiro[linha - 1][colunas - 2] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;						
						tabuleiro[linha - 1][colunas] = 3;
						tabuleiro[linha - 1][colunas + 1] = 3;
					} else if (tabuleiro[linha - 1][colunas - 1] == 2){

						azul.aumentarPontuacao();

						tabuleiro[linha - 1][colunas - 2] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;						
						tabuleiro[linha - 1][colunas] = 3;
						tabuleiro[linha - 1][colunas + 1] = 3;
					}
				}
			} else if (colunas <= 4 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 1][colunas] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 1][colunas + 1] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 1][colunas + 2]) {
				if (tabuleiro[linha - 1][colunas - 1] == 1) {

					vermelho.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 1][colunas] = 3;
					tabuleiro[linha - 1][colunas + 1] = 3;
					tabuleiro[linha - 1][colunas + 2] = 3;
				} else if (tabuleiro[linha - 1][colunas - 1] == 2){

					azul.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 1][colunas] = 3;
					tabuleiro[linha - 1][colunas + 1] = 3;
					tabuleiro[linha - 1][colunas + 2] = 3;
				}
			}
		}
		
		if (linha >= 4) { //descendo
			if (tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 2][colunas - 1] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 3][colunas - 1] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 4][colunas - 1]) {
				if (tabuleiro[linha - 1][colunas - 1] == 1) {

					vermelho.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 2][colunas - 1] = 3;
					tabuleiro[linha - 3][colunas - 1] = 3;
					tabuleiro[linha - 4][colunas - 1] = 3;
				} else if (tabuleiro[linha - 1][colunas - 1] == 2) {

					azul.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 2][colunas - 1] = 3;
					tabuleiro[linha - 3][colunas - 1] = 3;
					tabuleiro[linha - 4][colunas - 1] = 3;
				}
			}
		} 
		 
		if (linha >= 3 && colunas >= 3) { // diagonal esquerda baixo
			if (colunas < 7 && linha < 6 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha][colunas]) {
				if (tabuleiro[linha][colunas] == tabuleiro[linha - 1][colunas - 1] && tabuleiro[linha][colunas] == tabuleiro[linha - 2][colunas - 2] && tabuleiro[linha][colunas] == tabuleiro[linha - 3][colunas - 3]) {
					if (tabuleiro[linha - 1][colunas - 1] == 1) {

						vermelho.aumentarPontuacao();
						
						tabuleiro[linha][colunas] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;
						tabuleiro[linha - 2][colunas - 2] = 3;
						tabuleiro[linha - 3][colunas - 3] = 3;
					} else if (tabuleiro[linha - 1][colunas - 1] == 2) {

						azul.aumentarPontuacao();
						
						tabuleiro[linha][colunas] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;
						tabuleiro[linha - 2][colunas - 2] = 3;
						tabuleiro[linha - 3][colunas - 3] = 3;
					}
				}
			} else if (colunas >= 4 && linha >= 4 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 2][colunas - 2] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 3][colunas - 3] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 4][colunas - 4]) {
				if (tabuleiro[linha - 1][colunas - 1] == 1) {

					vermelho.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 2][colunas - 2] = 3;
					tabuleiro[linha - 3][colunas - 3] = 3;
					tabuleiro[linha - 4][colunas - 4] = 3;
				} else if (tabuleiro[linha - 1][colunas - 1] == 2) {
					azul.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 2][colunas - 2] = 3;
					tabuleiro[linha - 3][colunas - 3] = 3;
					tabuleiro[linha - 4][colunas - 4] = 3;
				}
			}
		} 
		if (linha >= 3 && colunas <= 5) { //diagonal direita baixo
			if (colunas > 1 && linha < 6) {
				
				if (tabuleiro[linha][colunas - 2] == tabuleiro[linha - 1][colunas - 1] && tabuleiro[linha][colunas - 2] == tabuleiro[linha - 2][colunas] && tabuleiro[linha][colunas - 2] == tabuleiro[linha - 3][colunas + 1]) {
					
					if (tabuleiro[linha - 1][colunas - 1] == 1) {
						vermelho.aumentarPontuacao();
						
						tabuleiro[linha][colunas - 2] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;
						tabuleiro[linha - 2][colunas] = 3;
						tabuleiro[linha - 3][colunas + 1] = 3;
					} else if (tabuleiro[linha - 1][colunas - 1] == 2) {

						azul.aumentarPontuacao();
						
						tabuleiro[linha][colunas - 2] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;
						tabuleiro[linha - 2][colunas] = 3;
						tabuleiro[linha - 3][colunas + 1] = 3;
					}
				}
			} 
			
			if (colunas <= 4 && linha >= 4 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 2][colunas] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 3][colunas + 1] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 4][colunas + 2]) {
				if (tabuleiro[linha - 1][colunas - 1] == 1) {

					vermelho.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 2][colunas] = 3;
					tabuleiro[linha - 3][colunas + 1] = 3;
					tabuleiro[linha - 4][colunas + 2] = 3;
				} else if (tabuleiro[linha - 1][colunas - 1] == 2) {
					System.out.println("teste");
					
					azul.aumentarPontuacao();

					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha - 2][colunas] = 3;
					tabuleiro[linha - 3][colunas + 1] = 3;
					tabuleiro[linha - 4][colunas + 2] = 3;
				}
			}
		}
		
		if (linha <= 3 && colunas >= 4) { //diagonal esquerda cima
			if (colunas < 7 && linha > 1 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 2][colunas]) {
				if (tabuleiro[linha - 2][colunas] == tabuleiro[colunas - 1][linha - 1] && tabuleiro[linha - 2][colunas] == tabuleiro[linha][colunas - 2] && tabuleiro[linha - 2][colunas] == tabuleiro[linha + 1][colunas - 3]) {
					if (tabuleiro[linha - 1][colunas - 1] == 1) {
						vermelho.aumentarPontuacao();
						
						tabuleiro[linha - 2][colunas] = 3;
						tabuleiro[colunas - 1][linha - 1] = 3;
						tabuleiro[linha][colunas - 2] = 3;
						tabuleiro[linha + 1][colunas - 3] = 3;
					} else if (tabuleiro[linha - 1][colunas - 1] == 2) {
						azul.aumentarPontuacao();
						

						tabuleiro[linha - 2][colunas] = 3;
						tabuleiro[colunas - 1][linha - 1] = 3;
						tabuleiro[linha][colunas - 2] = 3;
						tabuleiro[linha + 1][colunas - 3] = 3;
					}
				}
			} else if (tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha][colunas - 2] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha + 1][colunas - 3] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha + 2][colunas - 4]) {
				if (tabuleiro[linha - 1][colunas - 1] == 1) {
					vermelho.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha][colunas - 2] = 3;
					tabuleiro[linha + 1][colunas - 3] = 3;
					tabuleiro[linha + 2][colunas - 4] = 3;
				} else if (tabuleiro[linha - 1][colunas - 1] == 2) {
					azul.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha][colunas - 2] = 3;
					tabuleiro[linha + 1][colunas - 3] = 3;
					tabuleiro[linha + 2][colunas - 4] = 3;
				}
			}
		}
		
		if (linha <= 3 && colunas <= 4) { //diagonal direita cima
			if (colunas > 1 && linha > 1 && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha - 2][colunas - 2]) {
				if (tabuleiro[linha - 2][colunas - 2] == tabuleiro[linha - 1][colunas - 1] && tabuleiro[linha - 2][colunas - 2] == tabuleiro[linha][colunas] && tabuleiro[linha - 2][colunas - 2] == tabuleiro[linha + 1][colunas + 1]) {
					if (tabuleiro[linha - 1][colunas - 1] == 1) {
						vermelho.aumentarPontuacao();
						
						tabuleiro[linha - 2][colunas - 2] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;
						tabuleiro[linha][colunas] = 3;
						tabuleiro[linha + 1][colunas + 1] = 3;
					} else if (tabuleiro[linha - 1][colunas - 1] == 2) {
						azul.aumentarPontuacao();
						
						tabuleiro[linha - 2][colunas - 2] = 3;
						tabuleiro[linha - 1][colunas - 1] = 3;
						tabuleiro[linha][colunas] = 3;
						tabuleiro[linha + 1][colunas + 1] = 3;
					}
				}
			} else if (tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha][colunas] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha + 1][colunas + 1] && tabuleiro[linha - 1][colunas - 1] == tabuleiro[linha + 2][colunas + 2]) {
				if (tabuleiro[linha - 1][colunas - 1] == 1) {
					vermelho.aumentarPontuacao();
					
					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha][colunas] = 3;
					tabuleiro[linha + 1][colunas + 1] = 3;
					tabuleiro[linha + 2][colunas + 2] = 3;
				} else if (tabuleiro[linha - 1][colunas - 1] == 2) {
					azul.aumentarPontuacao();

					tabuleiro[linha - 1][colunas - 1] = 3;
					tabuleiro[linha][colunas] = 3;
					tabuleiro[linha + 1][colunas + 1] = 3;
					tabuleiro[linha + 2][colunas + 2] = 3;
				}
			}
		}
	}	
}
