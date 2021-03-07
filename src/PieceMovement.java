
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saroff
 */
public interface PieceMovement {
    public boolean move( ChessGameBoard board, int row, int col );
    public ArrayList<String> calculatePossibleMoves( ChessGameBoard board );
}
