import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author niquito
 */
public interface ChessPiece {
    public ArrayList<String> calculatePossibleMoves(ChessGameBoard board);
    public ImageIcon createImageByPieceType();
}