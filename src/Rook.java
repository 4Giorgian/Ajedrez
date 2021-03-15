import javax.swing.ImageIcon;
import java.util.ArrayList;
// -------------------------------------------------------------------------

public class Rook extends ChessGamePiece implements IRook{
   
    public Rook( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }
   
    @Override
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
    
    
    
    @Override
    public IRook clonar() {
       
        Rook rookClonada = null;
        try {
            rookClonada = (Rook) clone(); 
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return rookClonada;
    }
    

   

    

   
    
    
}