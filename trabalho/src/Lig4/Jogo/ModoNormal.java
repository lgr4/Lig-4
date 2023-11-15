package Lig4.Jogo;

import Lig4.Tabuleiro.Tabuleiro;

public class ModoNormal extends Jogo{
	private Tabuleiro tabuleiro = new Tabuleiro();
	
	private int[][] pecas = tabuleiro.getTabuleiro();
	
	private int[] linha = tabuleiro.getColunas();
	
	private int jogada = 0;
	
	public ModoNormal () {
		super();
	}
	
	public int getPontuacaoVermelho () {
		return super.getPontuacaoVermelho();
	}
	
	public int getPontuacaoAzul () {
		return super.getPontuacaoAzul();
	}
	
	
	
	//Subir linha:
	
	public void peca(int escolha) {
		pecas[linha[escolha-1]][escolha - 1] = (jogada%2 == 0) ? 1 : 2; //Alterna a vez dos jogadores.
	}
	
	//Métodos get:
	
	public int getLinha(int i) {
		return linha[i];
	}
	
	public int getJogada() {
		return jogada;
	}
	
	public int getPeca(int i, int j) {
		return pecas[i][j];
	}
	
	//Método que inicia o jogo:
	
	public void jogar(int escolha) {
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
