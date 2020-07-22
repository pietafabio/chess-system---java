package boardgame;

public class Piece {
	
	protected Position position;		//'protected' para que esta posi��o n�o seja vis�vel na camada 'Chess layer' (posi��o simples de matriz). 'position' = nome do atributo.
	private Board board;				// associando a pe�a com o tabuleiro
	public Piece(Board board) {			// somente associar a pe�a ao tabuleiro j� que a posi��o inicial � 'null', n�o foi colocada no tabuleiro ainda.
			this.board = board;
			position = null;
		
	}

	protected Board getBoard() {		// 'protected' porque somente classes do mesmo pacote e subclasses poder�o acessar o tabuleiro de uma pe�a.
		return board;
	}
	

}
