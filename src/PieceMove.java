import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public interface PieceMove {    
    
    public ArrayList<String> calculateSouthMoves(ChessGameBoard board,int numMoves );
    public ArrayList<String> calculateNorthMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateEastMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateNorthWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateNorthEastMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateSouthWestMoves(ChessGameBoard board, int numMoves );
    public ArrayList<String> calculateSouthEastMoves(ChessGameBoard board, int numMoves ); 
}

    

