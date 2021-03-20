
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saroff
 */
public class NullPiece extends ChessGamePiece {

    public NullPiece(ChessGameBoard board, int row, int col, int pieceColor) {
        super(board, row, col, pieceColor);
    }

    @Override
    protected ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("not possible value");
        return list;
    }

    @Override
    public ImageIcon createImageByPieceType() {
        return new ImageIcon(
                getClass().getResource("chessImages/notImage.gif")
            );
    }
    
}
