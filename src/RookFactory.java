/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saroff
 */
public class RookFactory extends ChessPieceFactory {
       
    @Override
    public ChessPiece createChessPiece(ChessGameBoard board, int row, int column, int color) {
        return new Rook(board, row, column, color);
    }
}
