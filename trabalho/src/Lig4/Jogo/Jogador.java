package Lig4.Jogo;

import Lig4.Exceptions.*;

public class Jogador {

	private int pontuacao, cor;
	
	private String nome;
	
	//Métodos get/set:
	
	public void setPontuacao(int pontuacao) {
		try {
			this.pontuacao = pontuacao;
		} catch (NumberFormatException e) {
			
		}
	}
		
	public void setNome(String nome) {
		try {
			this.nome = nome;
		} catch (Exception e) {
			
		}
	}
	
	public void SetPontuacao(int pontuacao) {
		try {
			this.pontuacao = pontuacao;
		} catch(NumberFormatException e) {
			
		}
	}
	
	public int getCor () {
		return this.cor;
	}
		
	public int getPontuacao () {
		return this.pontuacao;
	}
		
	public String getNome() {
		return this.nome;
	}
	
	//Inserção das características dos jogadores:
	
	public void setCor (int cor) {
		try {
			this.cor = cor;
		} catch (NumberFormatException e) {
			System.out.println("Valor inválido");
		}
		
	}
	
	//Pontuacao dos jogadores:
	
	public void aumentarPontuacao () {
		this.pontuacao += 100;
	}
	
	public void testarException (int escolha) throws InvalidEscolhaException{
		if (escolha > 0 && escolha < 8) {
			
		} else if (escolha == 100){
			throw new InvalidEscolhaException(Integer.toString(escolha));
		}
	}	
}
