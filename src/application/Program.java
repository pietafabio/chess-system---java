package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

	ChessMatch chessMatch = new ChessMatch();			// instanciando uma partida de xadrez e imprimir o tabuleiro  
	UI.printBoard(chessMatch.getPieces());				// fun��o para imprimir as pe�as da partida atrav�s da classe 'UI' pelo m�todo 'printBoard'	
	}

}
