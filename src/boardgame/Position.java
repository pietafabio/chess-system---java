package boardgame;

public class Position {

	private int row;						// encapsulamento das variáveis
	private int column;						// encapsulamento das variáveis
	
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
	public String toString() {				// fazendo o 'toString' estamos sobrescrevendo este método que é da classe 'object' 
		return row + ", " + column;
	}
}
