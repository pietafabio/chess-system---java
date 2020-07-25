package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece { // porquê 'ChessPiesse' é uma subclasse de 'Piece'

	private Color color; // atributo da classe

	public ChessPiece(Board board, Color color) { // construtor recebendo o 'Board' e 'Color' repassando a chamada para
													// o construtor da 'superclasse' que é 'Piece'
		super(board);
		this.color = color;
	}

	public Color getColor() { // somente 'get' para somente acessar a cor a impedir que seja alterada
		return color;
	}

}
