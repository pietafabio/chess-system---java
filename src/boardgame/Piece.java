package boardgame;

public abstract class Piece {

	protected Position position; // 'protected' porque somente classes do mesmo pacote e subclasses de outro pacote poderão acessar o objeto 'Position' de atributo 'position' da classe 'Piece'.  
	private Board board;	// 'private' porque o objeto 'Board' de atributo 'board' somente pode ser acessado por esta classe 'Piece'. 
	
	public Piece(Board board) {	// somente associar o objeto 'Piece' ao objeto 'Board' de atributo 'board', já que a posição inicial é 'null', pois não foi colocada no tabuleiro ainda.
		this.board = board;
		position = null;
	}

	protected Board getBoard() {	// 'protected' porque somente classes do mesmo pacote e subclasses de outro pacote poderão acessar o objeto 'Board' de atributo 'board' da classe 'Piece'.
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}