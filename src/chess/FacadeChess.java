package chess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
/**
 *
 * @author Sono Cattivo
 */
public class FacadeChess {
    
 private JFrame jFrame;
 
  public FacadeChess(String type) {
        jFrame = new JFrame( "YetAnotherChessGame 1.0 -- ".concat(type) );
    }

    public void createGame() {
      
        jFrame = new JFrame( "YetAnotherChessGame 1.0" );
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        jFrame.getContentPane().add( new ChessPanel() );
        jFrame.pack();
        jFrame.setVisible( true );
        
    }
    
}
