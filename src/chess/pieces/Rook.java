package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) { // este construtor passa a chamada para a superclasse
		super(board, color); // informando quem é o 'board', qual a 'color' e repassando a superclasse
	}

	@Override
	public String toString() {
		return "R";
	}

}
