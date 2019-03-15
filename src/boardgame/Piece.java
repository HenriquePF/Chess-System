package boardgame;

public class Piece {
	
	// Classe Piece da BoardLayer
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
