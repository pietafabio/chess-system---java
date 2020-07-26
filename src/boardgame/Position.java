package boardgame;

public class Position {

	private int row;						// encapsulamento das variáveis pelo método private
	private int column;						
	
	public Position(int row, int column) {	// 1o. construtores recebendo os argumentos
		this.row = row;
		this.column = column;
	}
	public int getRow() {					// 2o. criando getters and setters
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
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override								// 3o. 'sobrescrevendo' o método 'toString' que é da classe 'object', já que todas as classes pertencem a classe 'object'	
	public String toString() {				// 4o. fazendo o 'toString' para imprimir a posição na tela  
		return row + ", " + column;
	}
}
