package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {	 // porquê 'ChessPiesse' é uma subclasse de 'Piece'

	private Color color;

	public ChessPiece(Board board, Color color) {	// construtor recebendo o 'Board' e 'Color' repassando a chamada para o construtor da 'superclasse' que é 'Piece'
		super(board);
		this.color = color;
	}

	public Color getColor() {	// somente 'get' para somente acessar a cor a impedir que seja alterada
		return color;
	}
		protected boolean isThereOpponentPiece(Position position) {
			ChessPiece p = (ChessPiece)getBoard().piece(position);
			return p != null && p.getColor() != color;
	}
}