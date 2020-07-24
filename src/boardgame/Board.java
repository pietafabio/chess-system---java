package boardgame;

public class Board {

	private int rows; 							// quantidade de linhas
	private int columns; 						// quantidade de colunas
	private Piece[][] pieces; 					// uma matriz de pe�as de nome 'pieces'
			
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; 		// a matriz 'pieces' vai ser instanciada com 'Piece' na quantidade de linhas
												// e colunas informadas
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece piece(int row, int column) { 		// criado m�todo para retornar a posi��o de uma pe�a ap�s informada
													// posi��o de linha e coluna
													// retornando um objeto do tipo 'Piece', nome do m�todo 'piece',
													// recebendo 'int row' e 'int column'
		return pieces[row][column]; // retornando a matriz 'Pieces' na linha 'row' e coluna 'column'
	}

	public Piece piece(Position position) {			// Sobrecarga: retornando a pe�a pela posi��o
		return pieces[position.getRow()][position.getColumn()];		// retorna a pe�a na posi��o da linha e coluna informada
			}
}