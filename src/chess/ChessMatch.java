package chess;

import boardgame.Board;

public class ChessMatch { 				// nesta classe estarão as regras do jogo de xadrez

	private Board board;				// 'private' porque o objeto 'Board' de atributo 'board' somente pode ser acessado por esta classe 'ChessMatch'. 

	public ChessMatch() {
		board = new Board(8, 8); 		// aqui se declara o tamanho do tabuleiro
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
