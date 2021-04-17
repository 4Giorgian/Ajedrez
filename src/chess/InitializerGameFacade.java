package chess;

import javax.swing.JFrame;

public class InitializerGameFacade {
    private JFrame jFrame;

    public InitializerGameFacade(String type) {
        jFrame = new JFrame( "YetAnotherChessGame 1.0 -- ".concat(type) );
    }

    public void createGame() {
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        jFrame.getContentPane().add( new ChessPanel() );
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible( true );
    }
}
