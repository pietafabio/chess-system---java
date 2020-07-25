package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) { // programa��o defensiva para evitar posi��es fora do 'board'
																	
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() { // converte o 'chessPosition' para o 'Position'
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) { // opera��o inversa: de 'Position' para
																		// 'ChessPosition'
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow()); // f�rmula inversa
	}

	@Override
	public String toString() { // imprimir a posi��o de xadrez na ordem: string vazio concatenado com coluna e
								// concatenado com a linha
		return "" + column + row;
	}
}