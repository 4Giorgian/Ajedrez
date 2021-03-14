
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gianmarco
 */
public interface QueenInterface  extends Cloneable {
  
    public ImageIcon createWhiteQueen();
    public ImageIcon createBlackQueen();
    QueenInterface clonar();
  
}
