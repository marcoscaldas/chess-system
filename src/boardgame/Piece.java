package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;  // fazendo a associacao com a classe board
	
	public Piece(Board board) {
		this.board = board;
		position = null;// nao precisa colocar pois o java ja diz que é nulo
	}

	protected Board getBoard() {
		return board;
	}
	
	

}
