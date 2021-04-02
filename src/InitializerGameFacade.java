import javax.swing.JFrame;

public class InitializerGameFacade {
    private JFrame jFrame;

    public InitializerGameFacade() {
        jFrame = new JFrame( "YetAnotherChessGame 1.0" );
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        jFrame.getContentPane().add( new ChessPanel() );
        jFrame.pack();
        jFrame.setVisible( true );
    }
}
