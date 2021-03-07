
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
public class BishopPrint extends ChessGamePiece {

    public BishopPrint(ChessGameBoard board, int row, int col, int pieceColor) {
        super(board, row, col, pieceColor);
    }

    @Override
    protected ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageIcon createImageByPieceType() {
        if (getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(
                    getClass().getResource("chessImages/WhiteBishop.gif")
            );
        } else if (getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackBishop.gif")
            );
        } else {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackBishop.gif")
            );
        }
    }

}
