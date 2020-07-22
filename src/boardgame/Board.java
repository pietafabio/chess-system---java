package boardgame;

public class Board {

	private int rows;				// quantidade de linhas
	private int columns;			// quantidade de colunas
	private Piece[][] pieces;		// uma matriz de peças de nome 'pieces'
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];		// a matriz 'pieces' vai ser instanciada com 'Piece' na quantidade de linhas e colunas informadas
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
		
	
}
