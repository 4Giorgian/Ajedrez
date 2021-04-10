
public class PieceFactory  implements AbstractElementsBoardFactory{

	@Override
	public ChessGamePiece CreateStandarPiece(String pieceName, ChessGameBoard board, int row, int col, int color) {
		if (pieceName.equalsIgnoreCase("PAWN")) {
			return new Pawn(board, row, col, color);
		} else if (pieceName.equalsIgnoreCase("KING")) {
			return new King(board, row, col, color);
		} else if (pieceName.equalsIgnoreCase("QUEEN")) {
			return new Queen(board, row, col, color);
		} else if (pieceName.equalsIgnoreCase("KNIGHT")) {
			return new Knight(board, row, col, color);
		} else if (pieceName.equalsIgnoreCase("BISHOP")) {
			return new Bishop(board, row, col, color);
		} else if (pieceName.equalsIgnoreCase("ROOK")) {
			return new Rook(board, row, col, color);
		}

        return null;
		// TODO Auto-generated method stub
	}

	@Override
	public BoardSquare createBoardSquare(int row, int col, ChessGamePiece piece) {
		// TODO Auto-generated method stub
		return null;
	}

}
