package chess;

public class ChessException extends RuntimeException {
	private static final long serialVersionUID = 1L;		// criado número serial padrão 1

	public ChessException(String msg) {						// construtor
		super(msg);											// repassando para o construtor da superclasse esta msg
	}
}