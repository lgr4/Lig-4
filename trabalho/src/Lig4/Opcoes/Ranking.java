package Lig4.Opcoes;

import java.util.ArrayList;

public class Ranking {
	
	ArrayList<String> players = new ArrayList<String>();
	
	ArrayList<String> pontuacao = new ArrayList<String>();

	public String getPlayersRanking(int i) {
		return players.get(i);
	}
	
	public String getPlayersPoints(int i) {
		return pontuacao.get(i);
	}
	
	public int getRankingSize() {
		return players.size();
	}
	
	public void addRanking (String player1, String player2, String pontuacao1, String pontuacao2) {
		if (Integer.parseInt(pontuacao1) > Integer.parseInt(pontuacao2)) {
			
			players.add(player1);
			pontuacao.add(pontuacao1);
			
			players.add(player2);
			pontuacao.add(pontuacao2);
			
			ordenarRanking();
		} else {	
			players.add(player2);
			pontuacao.add(pontuacao2);
			
			players.add(player1);
			pontuacao.add(pontuacao1);
			
			ordenarRanking();
		}
		
	}
	
	public void ordenarRanking() {
		if(players.size() > 1) {
			int tempAux;
			String tempPlayers;
			int aux[] = new int[pontuacao.size()];
			  
			
			for(int k = 0; k < aux.length; k++) {
				aux[k] = Integer.parseInt(pontuacao.get(k));
			}
			
			for (int i = 0; i <aux.length; i++) {     
		          for (int j = i+1; j < aux.length; j++) {     
		              if(aux[i] > aux[j]) { 
		                 tempAux = aux[i];
		                 tempPlayers = players.get(i);
		                 aux[i] = aux[j];    
		                 aux[j] = tempAux;
		                 players.set(i, players.get(j));
		                 players.set(j, tempPlayers);
		              }     
		           }     
		      } 
			
			for(int k = 0; k < aux.length; k++) {
				pontuacao.set(k, Integer.toString(aux[k]));
			}
		}
	}
}