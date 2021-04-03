import javax.swing.JFrame;

public class FacadePatron {
    private JFrame jFrame;

    public FacadePatron() {
        ChessPanel panel = null;
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( panel.getInstance() );
        frame.pack();
        frame.setVisible( true );
    }
}
