import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public interface ChessGamePieceMoves {    
    
    public ArrayList<String> calculatePossibleMoves( ChessGameBoard board );
    public ArrayList<String> calculateSouthMoves(ChessGameBoard board,int numMoves );
    public ArrayList<String> calculateNorthMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateEastMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateNorthWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateNorthEastMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateSouthWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateSouthEastMoves(ChessGameBoard board, int numMoves ); 
    public boolean move( ChessGameBoard board, int row, int col );
    public boolean canMove( ChessGameBoard board, int row, int col );
    public boolean testMoveForKingSafety(ChessGameBoard board, int row, int col);
    public void updatePossibleMoves( ChessGameBoard board );
    public void showLegalMoves( ChessGameBoard board );
    public boolean hasLegalMoves( ChessGameBoard board );
}

    

