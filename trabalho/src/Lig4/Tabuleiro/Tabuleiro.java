package Lig4.Tabuleiro;

public class Tabuleiro {
	
	private int[] colunas; //Quantidade de peças em cada coluna (array já vem com todos os termos iguais a zero).
	
	private int[][] tabuleiro; //1 = Vermelho e 2 = Azul.
	
	public Tabuleiro () {
		this.colunas = new int[7];
		this.tabuleiro = new int[6][7];;
	}
	
	public int[] getColunas () {
		return colunas;
	}
	
	public int[][] getTabuleiro () {
		return tabuleiro;
	}
	
	public void setColunas (int[] colunas) {
		try {
			this.colunas = colunas;
		} catch (NumberFormatException exception) {
			System.out.println("Valor inválido.");
		}
	}
	
	public void setTabuleiro (int[][] tabuleiro) {
		try {
			this.tabuleiro = tabuleiro;
		} catch (NumberFormatException exception) {
			System.out.println("Valor inválido.");
		}
	}
}
