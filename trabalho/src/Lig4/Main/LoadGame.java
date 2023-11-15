package Lig4.Main;


import Lig4.Exceptions.InvalidEscolhaException;
import Lig4.Jogo.*;

import Lig4.Opcoes.*;

public class LoadGame {
	ModoNormal lig4Normal = new ModoNormal();
	
	ModoTurbo lig4Turbo = new ModoTurbo();
	
	ModoTurboMaluco lig4TurboMaluco = new ModoTurboMaluco();
	
	Menu menu = new Menu();
	
	
	public void jogar() throws InvalidEscolhaException {
		while (true) {
			menu.escolherModo();
			
			if (menu.getModo() == 1) {
				lig4Normal.jogoNormal();
			} else if (menu.getModo() == 2){
				lig4Turbo.jogoTurbo();
			} else if (menu.getModo() == 3){
				lig4TurboMaluco.jogoTurboMaluco();
			} else if (menu.getModo() == 4) {
				System.out.println("Obrigado por jogar!");
				break;
			}
		}
	}
}