package boardgame;

public class Board {

	private int rows; 							// quantidade de linhas
	private int columns; 						// quantidade de colunas
	private Piece[][] pieces; 					// uma matriz de peças de nome 'pieces'
			
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

	public Piece piece(int row, int column) { 		// criado método para retornar a posição de uma peça após informada
													// posição de linha e coluna
													// retornando um objeto do tipo 'Piece', nome do método 'piece',
													// recebendo 'int row' e 'int column'
		return pieces[row][column]; // retornando a matriz 'Pieces' na linha 'row' e coluna 'column'
	}

	public Piece piece(Position position) {			// Sobrecarga: retornando a peça pela posição
		return pieces[position.getRow()][position.getColumn()];		// retorna a peça na posição da linha e coluna informada
			}
}