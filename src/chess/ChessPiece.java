package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {	 // porqu� 'ChessPiesse' � uma subclasse de 'Piece'

	private Color color;

	public ChessPiece(Board board, Color color) {	// construtor recebendo o 'Board' e 'Color' repassando a chamada para o construtor da 'superclasse' que � 'Piece'
		super(board);
		this.color = color;
	}

	public Color getColor() {	// somente 'get' para somente acessar a cor a impedir que seja alterada
		return color;
	}
}