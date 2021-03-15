/**
 *
 * @author niquito
 */
import javax.swing.ImageIcon;


public interface IRook  extends Cloneable {
  
    public ImageIcon createWhiteRook();
    public ImageIcon createBlackRook();
    IRook clonar();
  
}
