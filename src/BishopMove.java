
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gperezr-e
 */
public class BishopMove extends ChessGamePiece {

    public BishopMove(ChessGameBoard board, int row, int col, int pieceColor) {
        super(board, row, col, pieceColor);
    }

    @Override
    protected ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
        ArrayList<String> northEastMoves = calculateNorthEastMoves(board, 8);
        ArrayList<String> northWestMoves = calculateNorthWestMoves(board, 8);
        ArrayList<String> southEastMoves = calculateSouthEastMoves(board, 8);
        ArrayList<String> southWestMoves = calculateSouthWestMoves(board, 8);
        ArrayList<String> allMoves = new ArrayList<String>();
        allMoves.addAll(northEastMoves);
        allMoves.addAll(northWestMoves);
        allMoves.addAll(southEastMoves);
        allMoves.addAll(southWestMoves);
        return allMoves;
    }

    @Override
    public ImageIcon createImageByPieceType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
