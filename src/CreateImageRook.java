
import javax.swing.ImageIcon;


public class CreateImageRook {
    
    public ImageIcon CreateWhite() {
        
        return new ImageIcon(getClass().getResource("chessImages/WhiteRook.gif"));
        
    }
    
    public ImageIcon CreateBlack() {
        
        return new ImageIcon(getClass().getResource("chessImages/BlackRook.gif"));
        
    }
       
}
