import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;


public class DecoratorChessGameEngine extends ChessGameEngine{
    
    
    public DecoratorChessGameEngine( ChessGameBoard board ){
        super(board);
    }
    
    
    public void checkGameConditions(){
    
    int resp =JOptionPane.showConfirmDialog( board.getParent(), " ¿te rindes?" );
                    if ( resp == JOptionPane.YES_OPTION ){
                      reset();
                    }
                    else
                    {
                      
                    }
                    
      }      
    
}
