package boardgame;

public class Position {

	private int row;						// encapsulamento das vari�veis
	private int column;						// encapsulamento das vari�veis
	
	public Position(int row, int column) {	// construtores recebendo os argumentos
		this.row = row;
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override								// sobrescrevendo
	public String toString() {				// fazendo o 'toString' estamos sobrescrevendo este m�todo que � da classe 'object' 
		return row + ", " + column;
	}
}
