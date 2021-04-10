import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Rook extends ChessGamePiece{
   
     
    private CreateImageRook createimagerook;
     
    private Invoker broker;
    
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
   
    
    
    @Override
    public ImageIcon createImageByPieceType(){
        if ( getColorOfPiece() == ChessGamePiece.WHITE ){
            createimagerook= new CreateImageRook();
            CreateWhiteRook WhiteRook = new CreateWhiteRook(createimagerook);
            broker = new Invoker(WhiteRook);
            return broker.placeOrders();              
        }
        else if ( getColorOfPiece() == ChessGamePiece.BLACK ){
            createimagerook= new CreateImageRook();
            CreateBlackRook BlackRook = new CreateBlackRook(createimagerook);
            broker = new Invoker(BlackRook);
            return broker.placeOrders();       
        }
        else
        {
            return new ImageIcon(getClass().getResource("chessImages/default-Unassigned.gif") );   
        }
    }
    
    
   
    
    
    
    
    
    
    
}
