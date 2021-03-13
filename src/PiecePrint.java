import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public interface PiecePrint {
    
    public int getColorOfPiece();
    public ImageIcon getImage();
    public boolean isOnScreen(int row, int col);
    public boolean isPieceOnScreen();
       
}
