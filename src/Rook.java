import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
// -------------------------------------------------------------------------

public class Rook implements movimientos{
    protected boolean             skipMoveGeneration;
    protected int                 pieceColor;
    protected ImageIcon           pieceImage;
    
    protected ArrayList<String> possibleMoves;
    
    protected int               pieceRow;
   
    protected int               pieceColumn;
    
    static final int            BLACK      = 0;
    
    static final int            WHITE      = 1;
    
    static final int            UNASSIGNED = -1;
 
    /*public Rook( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }*/
    
    
    public boolean isOnScreen( int row, int col ){
        if ( row >= 0 && row <= 7 && col >= 0 && col <= 7 ){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isPieceOnScreen(){
        return isOnScreen( pieceRow, pieceColumn );
    }
    
     //@Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northMoves = calculateNorthMoves( board, 8 );
        ArrayList<String> southMoves = calculateSouthMoves( board, 8 );
        ArrayList<String> westMoves = calculateWestMoves( board, 8 );
        ArrayList<String> eastMoves = calculateEastMoves( board, 8 );
        ArrayList<String> allMoves = new ArrayList<String>();
        allMoves.addAll( northMoves );
        allMoves.addAll( southMoves );
        allMoves.addAll( westMoves );
        allMoves.addAll( eastMoves );
        return allMoves;
    }
    
    public ArrayList<String> calculateSouthMoves(ChessGameBoard board,int numMoves ){
        
        ArrayList<String> moves = new ArrayList<String>();
        int count = 0;
        if ( isPieceOnScreen() ){
            for ( int i = pieceRow + 1; i < 8 && count < numMoves; i++ ){
                if ( ( board.getCell( i, pieceColumn ).getPieceOnSquare()
                    == null || isEnemy( board, i, pieceColumn ) ) ){
                    moves.add( i + "," + pieceColumn );
                    count++;
                    if ( isEnemy( board, i, pieceColumn ) ){
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        return moves;
    }
    
    
    public int getColorOfPiece(){
        return pieceColor;
    }
    
     public boolean isEnemy( ChessGameBoard board, int row, int col ){
        if ( row > 7 || col > 7 || row < 0 || col < 0 ){
            return false;
        }
        ChessGamePiece enemyPiece =
            board.getCell( row, col ).getPieceOnSquare() == null
                ? null
                : board.getCell( row, col ).getPieceOnSquare();
        if ( enemyPiece == null
            || this.getColorOfPiece() == ChessGamePiece.UNASSIGNED
            || enemyPiece.getColorOfPiece() == ChessGamePiece.UNASSIGNED ){
            return false;
        }
        if ( this.getColorOfPiece() == ChessGamePiece.WHITE ){
            if ( enemyPiece.getColorOfPiece() == ChessGamePiece.BLACK ){
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if ( enemyPiece.getColorOfPiece() == ChessGamePiece.WHITE ){
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    public ArrayList<String> calculateNorthMoves(
        ChessGameBoard board,
        int numMoves ){
        ArrayList<String> moves = new ArrayList<String>();
        int count = 0;
        if ( isPieceOnScreen() ){
            for ( int i = pieceRow - 1; i >= 0 && count < numMoves; i-- ){
                if ( ( board.getCell( i, pieceColumn ).getPieceOnSquare()
                    == null || isEnemy( board, i, pieceColumn ) ) ){
                    moves.add( i + "," + pieceColumn );
                    count++;
                    if ( isEnemy( board, i, pieceColumn ) ){
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        return moves;
    }
    
    public ArrayList<String> calculateEastMoves(
        ChessGameBoard board,
        int numMoves ){
        ArrayList<String> moves = new ArrayList<String>();
        int count = 0;
        if ( isPieceOnScreen() ){
            for ( int i = pieceColumn + 1; i < 8 && count < numMoves; i++ ){
                if ( ( board.getCell( pieceRow, i ).getPieceOnSquare()
                    == null || isEnemy( board, pieceRow, i ) ) ){
                    moves.add( pieceRow + "," + i );
                    count++;
                    if ( isEnemy( board, pieceRow, i ) ){
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        return moves;
    }
    
    public ArrayList<String> calculateWestMoves(
        ChessGameBoard board,
        int numMoves ){
        ArrayList<String> moves = new ArrayList<String>();
        int count = 0;
        if ( isPieceOnScreen() ){
            for ( int i = pieceColumn - 1; i >= 0 && count < numMoves; i-- ){
                if ( ( board.getCell(pieceRow, i ).getPieceOnSquare()
                    == null || isEnemy( board, pieceRow, i ) ) ){
                    moves.add( pieceRow + "," + i );
                    count++;
                    if ( isEnemy( board, pieceRow, i ) ){
                        break;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        return moves;
    }
    
     
   
    
    //@Override
    public ImageIcon createImageByPieceType(){
        if ( getColorOfPiece() == ChessGamePiece.WHITE ){
            return createWhiteRook();            
        }
        else if ( getColorOfPiece() == ChessGamePiece.BLACK ){
            return createBlackRook();           
        }
        else
        {
            return new ImageIcon(
                getClass().getResource("chessImages/default-Unassigned.gif")
            );        
        }
    }
    
    
    public ImageIcon createWhiteRook() {
        return new ImageIcon(
                getClass().getResource("chessImages/WhiteRook.gif")
            );
    }
    
    public ImageIcon createBlackRook() {
        return new ImageIcon(
                getClass().getResource("chessImages/BlackRook.gif")
            );
    }

    

   
    
    
}