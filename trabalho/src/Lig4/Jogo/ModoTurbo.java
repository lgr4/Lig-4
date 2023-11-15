package Lig4.Jogo;

import Lig4.Tabuleiro.Tabuleiro;

public class ModoTurbo extends Jogo{

	Tabuleiro tabuleiro = new Tabuleiro();
	
	private int[][] pecas = tabuleiro.getTabuleiro();
	
	private int[] linha = tabuleiro.getColunas();
	
	private int jogada = 0; 
	private int modoTurbo[] = new int[2];
	
	public ModoTurbo () {
		super();
	}
	
	//Métodos get:
	
	public int getModoTurbo(int i) {
		return modoTurbo[i];
	}
	
	public int getPontuacaoVermelho () {
		return super.getPontuacaoVermelho();
	}
	
	public int getPontuacaoAzul () {
		return super.getPontuacaoAzul();
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
	
	//Métodos do Modo Turbo:
	
	public void Lig4Turbo (int[][] tabuleiro, int coluna, int linha, int vez ) {
		
		if (coluna > 1 && (tabuleiro[linha][coluna - 2] == 1 || tabuleiro[linha][coluna - 2] == 2)) {
			modoTurbo[0] = 1;
			
			tabuleiro[linha][coluna - 2] = (vez%2 == 0) ? 1 : 2;

		}
		
		if (coluna < 7 && (tabuleiro[linha][coluna] == 1 || tabuleiro[linha][coluna] == 2)) {
			modoTurbo[1] = 2;
			
			tabuleiro[linha][coluna] = (vez%2 == 0) ? 1 : 2;

		}
	}
	
	public void avaliacaoTurbo(int[][] tabuleiro, int coluna, int linha) {
		if (coluna > 1 && (tabuleiro[linha][coluna - 2] == 1 || tabuleiro[linha][coluna - 2] == 2)) {
			super.avaliacao(coluna - 1, linha + 1, tabuleiro);
		}
		
		if (coluna < 7 && (tabuleiro[linha][coluna] == 1 || tabuleiro[linha][coluna] == 2)) {
			super.avaliacao(coluna + 1, linha + 1, tabuleiro);
		}
	}
	
	//Método que inicia o jogo:
	
	public void peca(int escolha) {
		modoTurbo[0] = 0;
		modoTurbo[1] = 0;
		pecas[linha[escolha-1]][escolha - 1] = (jogada%2 == 0) ? 1 : 2; //Alterna a vez dos jogadores.
		Lig4Turbo(pecas, escolha, linha[escolha-1], jogada);
	}
	
	
	public void jogar(int escolha) {
		
		avaliacaoTurbo(pecas, escolha, linha[escolha-1]);

		linha[escolha - 1]++; //Adiciona uma peça à coluna escolhida.
		
		super.avaliacao(escolha,linha[escolha-1], pecas);
		
		jogada++;
	}
}
