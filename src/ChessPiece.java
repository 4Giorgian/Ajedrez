
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
public interface ChessPiece {
    public ArrayList<String> calculatePossibleMoves(ChessGameBoard board);
    public ImageIcon createImageByPieceType();
}
