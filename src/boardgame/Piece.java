package boardgame;

public class Piece {
										
	protected Position position;		// 'protected' porque somente classes do mesmo pacote e subclasses de outro pacote poder�o acessar o objeto 'Position' de atributo 'position' da classe 'Piece'.  
	private Board board;				// 'private' porque o objeto 'Board' de atributo 'board' somente pode ser acessado por esta classe 'Piece'. 
	
	public Piece(Board board) {			// somente associar o objeto 'Piece' ao objeto 'Board' de atributo 'board', j� que a posi��o inicial � 'null', pois n�o foi colocada no tabuleiro ainda.
			this.board = board;
			position = null;
		
	}
		
	protected Board getBoard() {		// 'protected' porque somente classes do mesmo pacote e subclasses de outro pacote poder�o acessar o objeto 'Board' de atributo 'board' da classe 'Piece'.
		return board;					
	}
	

}
