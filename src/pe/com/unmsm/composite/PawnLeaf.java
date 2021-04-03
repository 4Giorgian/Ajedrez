/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.unmsm.composite;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import pe.com.unmsm.ChessGameBoard;
import pe.com.unmsm.ChessGamePiece;

/**
 *
 * @author gperezr-e
 */
public class PawnLeaf extends ChessGamePiece implements ComponenteComposite{

    public PawnLeaf(ChessGameBoard board, int row, int col, int pieceColor) {
        super(board, row, col, pieceColor);
    }

    @Override
    public ArrayList<String> calculatePossibleMoves(ChessGameBoard board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageIcon createImageByPieceType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
