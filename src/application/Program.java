package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

	ChessMatch chessMatch = new ChessMatch();			// instanciando uma partida de xadrez e imprimir o tabuleiro  
	UI.printBoard(chessMatch.getPieces());				// função para imprimir as peças da partida através da classe 'UI' pelo método 'printBoard'	
	}

}
