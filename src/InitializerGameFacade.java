import javax.swing.JFrame;

public class InitializerGameFacade {
    private JFrame jFrame;

    public InitializerGameFacade() {
        jFrame = new JFrame( "YetAnotherChessGame 1.0" );
    }

    public void createGame() {
        Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        jFrame.getContentPane().add( new ChessPanel(caretaker, originator) );
        jFrame.pack();
        jFrame.setVisible( true );
    }
}
