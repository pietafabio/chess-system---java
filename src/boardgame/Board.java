package boardgame;

public class Board {

	private int rows; 							// quantidade de linhas
	private int columns; 						// quantidade de colunas
	private Piece[][] pieces; 					// declara��o de uma matriz '[][]' 'piece' de nome 'pieces'
			
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; 		// instancia��o da matriz 'pieces' com 'Piece' na quantidade de linhas
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
	
	public void placePiece(Piece piece, Position position) {	// m�todo: 'placePiece' recebendo uma 'piece' e uma 'position'
		pieces [position.getRow()][position.getColumn()] = piece;	// na matriz 'pieces' na linha 'position.getRow' e na linha 'position.getColumn',
																	// atribuir a esta posi��o da matriz �pieces' a pe�a que veio como argumento (linha de cima)
																	// e j� declarada no 'Board', linha 7 e instanciada no costrutor, linha 12.
		
		piece.position = position;	// declarando que esta �piece' n�o est� mais na posi��o 'null'
		
		
		
		
		
	}
}