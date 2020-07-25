package boardgame;

public class Board {

	private int rows; // quantidade de linhas
	private int columns; // quantidade de colunas
	private Piece[][] pieces; // declara��o de uma matriz '[][]' 'piece' de nome 'pieces'

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException(" Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; 		// instancia��o da matriz 'pieces' com 'Piece' na quantidade de linhas e colunas informadas
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) { 							// criado m�todo para retornar a posi��o de uma pe�a ap�s informada posi��o de linha e coluna retornando um objeto do tipo 'Piece', nome do m�todo 'piece', recebendo 'int row' e 'int column'
		if(!positionExists(row, column)) {
		throw new BoardException("Position not on the board");
		}
  		return pieces[row][column]; 									// retornando a matriz 'Pieces' na linha 'row' e coluna 'column'
	}

	public Piece piece(Position position) { 							// Sobrecarga: retornando a pe�a pela posi��o
			if (!positionExists(position)) { 
			throw new BoardException("Position not on the board");
	}
			return pieces[position.getRow()][position.getColumn()]; 	// retorna a pe�a na posi��o da linha e coluna informada
 			
		}
	public void placePiece(Piece piece, Position position) { 			// m�todo: 'placePiece' recebendo uma 'piece' e uma 'position' na matriz 'pieces' na linha 'position.getRow' e na linha 'position.getColumn', atribuir a esta posi��o da matriz �pieces' a pe�a que veio como argumento (linha de cima) e j� declarada no 'Board', linha 7 e instanciada no costrutor, linha 12.
		if (thereIsAPiece(position)) {
			throw new BoardException(" There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece; 		
		piece.position = position; 										// declarando que esta �piece' n�o est� mais na posi��o 'null'
	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns; // quando uma posi��o existe?  'row' menor ou igual a 0' e 'row' menor do que a altura do 'board' ('rows') column maior ou igual a '0' e menor do que a quantidade de 'columns'
	}

	public boolean positionExists(Position position) { 					// implementando a fun��o 'positionExists'
		return positionExists(position.getRow(), position.getColumn()); // reaproveitando o m�todo de cima
	}
	public boolean thereIsAPiece(Position position) { 					// implementando o m�todo 'thereIsAPiece' recebendo uma 'position'
		if (!positionExists(position)) { 
			throw new BoardException("Position not on the board");
		}
	return piece(position) != null; 									// se a 'piece(position)' for diferente de 'null', existe uma 'piece' na posi��o solicitada
										
	}
}