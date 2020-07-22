package boardgame;

public class Piece {
	
	protected Position position;		//'protected' para que esta posição não seja visível na camada 'Chess layer' (posição simples de matriz). 'position' = nome do atributo.
	private Board board;				// associando a peça com o tabuleiro
	public Piece(Board board) {			// somente associar a peça ao tabuleiro já que a posição inicial é 'null', não foi colocada no tabuleiro ainda.
			this.board = board;
			position = null;
		
	}

	protected Board getBoard() {		// 'protected' porque somente classes do mesmo pacote e subclasses poderão acessar o tabuleiro de uma peça.
		return board;
	}
	

}
