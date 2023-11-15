package Lig4.Main;

import java.awt.EventQueue;

import Lig4.Exceptions.InvalidEscolhaException;
import Lig4.Graphs.MenuPrincipal;
import Lig4.Opcoes.Ranking;

public class Main {
	public static void main(String[] args) {
		Ranking rank = new Ranking();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal(rank);
					window.showMenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
