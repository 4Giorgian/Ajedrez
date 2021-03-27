/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sono Cattivo
 */
public class PieceNormalFactory {
    public ChessGamePiece CreateNormalPiece(String pieceName, ChessGameBoard board, int row, int col, int color) {

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
    }
}