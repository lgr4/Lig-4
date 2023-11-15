package Lig4.Jogo;

import java.util.Random;

import Lig4.Tabuleiro.Tabuleiro;

public class ModoTurboMaluco extends Jogo {
	
	Random sortear = new Random();
	
	private Tabuleiro tabuleiro = new Tabuleiro();
	
	private int[][] pecas = tabuleiro.getTabuleiro();
	
	private int[] linha = tabuleiro.getColunas();
	
	private int jogada = 0, nivelMaluquice; 
	
	private int modoTurboMaluco[] = new int[7];

	public ModoTurboMaluco () {
		super();
	}
	
	public void nivelDeMaluquice() {
		nivelMaluquice = sortear.nextInt(100);
	}

	//Métodos get:

	public int getPontuacaoVermelho () {
		return super.getPontuacaoVermelho();
	}
	
	public int getPontuacaoAzul () {
		return super.getPontuacaoAzul();
	}
	
	
	
	public int getModoTurboMaluco (int i) {
		return modoTurboMaluco[i];
	}
	
	public int getLinha(int i) {
		return linha[i];
	}
	
	public int getJogada() {
		return jogada;
	}
	
	public int getPeca(int i, int j) {
		return pecas[i][j];
	}
	
	public int getNivelDeMaluquice () {
		return nivelMaluquice;
	}
	
	//Métodos do Modo Turbo Maluco
	
	public void Lig4TurboMaluco (int[][] tabuleiro, int coluna, int linha, int vez ) {
		//tabuleiro[linha][coluna - 1]
			if (coluna > 1 && (tabuleiro[linha][coluna - 2] == 1 || tabuleiro[linha][coluna - 2] == 2) ) {
				if (sortear.nextInt(100) <= nivelMaluquice) {
					modoTurboMaluco[0]++;
					tabuleiro[linha][coluna - 2] = (vez%2 == 0) ? 1 : 2;
				}
			}
			
			if (coluna < 7 && (tabuleiro[linha][coluna] == 1 || tabuleiro[linha][coluna] == 2)) {
				if (sortear.nextInt(100) <= nivelMaluquice) {
					modoTurboMaluco[1]++;
					tabuleiro[linha][coluna] = (vez%2 == 0) ? 1 : 2;
				}
			}
			
			if (linha > 0 && (tabuleiro[linha - 1][coluna-1] == 1 || tabuleiro[linha - 1][coluna-1] == 2)) { //embaixo
				if (sortear.nextInt(100) <= nivelMaluquice) {
					modoTurboMaluco[2]++;
					tabuleiro[linha-1][coluna-1] = (vez%2 == 0) ? 1 : 2;
				}
			}
			
			if (coluna < 7 && linha < 5 && (tabuleiro[linha + 1][coluna] == 1 || tabuleiro[linha + 1][coluna] == 2)) { //diagonal direita cima
				if (sortear.nextInt(100) <= nivelMaluquice) {
					modoTurboMaluco[3]++;
					tabuleiro[linha+1][coluna] = (vez%2 == 0) ? 1 : 2;
				}
			}
			
			if (coluna > 1 && linha < 5 && (tabuleiro[linha + 1][coluna - 2] == 1 || tabuleiro[linha + 1][coluna - 2] == 2) ) { //diagonal esquerda cima
				if (sortear.nextInt(100) <= nivelMaluquice) {
					modoTurboMaluco[4]++;
					tabuleiro[linha+1][coluna - 2] = (vez%2 == 0) ? 1 : 2;
				}
			}
			
			if (coluna > 1 && linha > 0 && (tabuleiro[linha - 1][coluna - 2] == 1 || tabuleiro[linha - 1][coluna - 2] == 2)) { //diagonal esquerda baixo
				if (sortear.nextInt(100) <= nivelMaluquice) {
					modoTurboMaluco[5]++;
					tabuleiro[linha-1][coluna - 2] = (vez%2 == 0) ? 1 : 2;
				}
			}
			
			if (coluna < 7 && linha > 0 && (tabuleiro[linha - 1][coluna] == 1 || tabuleiro[linha - 1][coluna] == 2)) { //diagonal direita baixo
				if (sortear.nextInt(100) <= nivelMaluquice) {
					modoTurboMaluco[6]++;
					tabuleiro[linha-1][coluna] = (vez%2 == 0) ? 1 : 2;
				}
			}
		
		
		}	
	
	
	public void avaliacaoTurboMaluco (int[][] tabuleiro, int coluna, int linha) {
		if (coluna > 1 && (tabuleiro[linha][coluna - 2] == 1 || tabuleiro[linha][coluna - 2] == 2) ) {
			super.avaliacao(coluna - 1, linha + 1, tabuleiro);
		}
		if (coluna < 7 && (tabuleiro[linha][coluna] == 1 || tabuleiro[linha][coluna] == 2)) {
			super.avaliacao(coluna+1, linha+1, tabuleiro);
		}
		if (linha > 0 && (tabuleiro[linha - 1][coluna-1] == 1 || tabuleiro[linha - 1][coluna-1] == 2)) {
			super.avaliacao(coluna, linha, tabuleiro);
		}
		if (coluna < 7 && linha < 5 && (tabuleiro[linha + 1][coluna] == 1 || tabuleiro[linha + 1][coluna] == 2)) {
			super.avaliacao(coluna+1, linha+2, tabuleiro);
		}
		if (coluna > 1 && linha < 5 && (tabuleiro[linha + 1][coluna - 2] == 1 || tabuleiro[linha + 1][coluna - 2] == 2) ) {
			super.avaliacao(coluna-1, linha+2, tabuleiro);
		}
		if (coluna > 1 && linha > 0 && (tabuleiro[linha - 1][coluna - 2] == 1 || tabuleiro[linha - 1][coluna - 2] == 2)) {
			super.avaliacao(coluna-1, linha, tabuleiro);
		}
		if (coluna < 7 && linha > 0 && (tabuleiro[linha - 1][coluna] == 1 || tabuleiro[linha - 1][coluna] == 2)) {
			super.avaliacao(coluna+1, linha, tabuleiro);
		}
	}
	
	
	//Método que inicia o jogo:
	
	public void peca(int escolha) {
		for(int k = 0; k < 7; k++) {
			modoTurboMaluco[k] = 0;
		}
		
		pecas[linha[escolha-1]][escolha - 1] = (jogada%2 == 0) ? 1 : 2; //Alterna a vez dos jogadores.
		Lig4TurboMaluco(pecas, escolha, linha[escolha-1], jogada);
	}
	
	public void jogar(int escolha) {
		avaliacaoTurboMaluco(pecas, escolha, linha[escolha-1]);

		linha[escolha - 1]++; //Adiciona uma peça à coluna escolhida.
		
		super.avaliacao(escolha,linha[escolha-1], pecas);
		
		jogada++;
		
		for (int i = 5; i > -1; i--) {
            for (int j = 0; j < 7; j++) {
                System.out.print(pecas[i][j] + " ");
            }
            System.out.println();
        }
	}

}
 