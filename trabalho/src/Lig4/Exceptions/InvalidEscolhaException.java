package Lig4.Exceptions;

public class InvalidEscolhaException extends Exception {
	public InvalidEscolhaException (String string) {
		super(string + " não é um valor válido. Você parou o jogo.");
	}
}
