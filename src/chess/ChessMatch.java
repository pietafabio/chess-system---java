package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { // nesta classe estarão as regras do jogo de xadrez

	private Board board; // 'private' porque o objeto 'Board' de atributo 'board' somente pode ser
							// acessado por esta classe 'ChessMatch'.

	public ChessMatch() {
		board = new Board(8, 8); // aqui se declara o tamanho do tabuleiro
		initialSetup(); // chamando o 'initialSetup' aqui, dentro do construtor da partida

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

	private void initialSetup() { // método reponsável por iniciar a partida de xadrez.
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1)); // colocando as 'pieces' no 'board',
																			// instanciando as peças
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}

}
