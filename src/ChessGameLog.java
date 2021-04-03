import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.util.Date;
// -------------------------------------------------------------------------
/**
 * A scrollable textArea representing the game log. (i.e. moves made by each
 * player)
 * 
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessGameLog
    extends JScrollPane
    implements ChessLog {
    
    private JTextArea textArea;
    // ----------------------------------------------------------
    /**
     * Create a new ChessGameLog object.
     */
    public ChessGameLog(){
        super(
            new JTextArea( "", 5, 30 ),
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS );
        textArea = ( (JTextArea)this.getViewport().getView() );
    }
    // ----------------------------------------------------------
    /**
     * Adds a new line of text to the log.
     * 
     * @param s
     *            the line of text to add
     */
    @Override
    public void addToLog( String s ){
        if ( textArea.getText().length() > 0 ){
            textArea.setText( textArea.getText() + "\n" + new Date() + " - "
                + s );
        }
        else
        {
            textArea.setText( new Date() + " - " + s );
        }
    }
    /**
     * Clears the log.
     */
    @Override
    public void clearLog(){
        textArea.setText( "" );
    }
    // ----------------------------------------------------------
    /**
     * Gets the most recent statement added to the log.
     * 
     * @return String the most recent log statement
     */
    @Override
    public String getLastLog(){
        int indexOfLastNewLine = textArea.getText().lastIndexOf( "\n" );
        if ( indexOfLastNewLine < 0 ){
            return textArea.getText();
        }
        return textArea.getText().substring( indexOfLastNewLine + 1 );
    }
    
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
    
    public JTextArea getTextArea() {
        return textArea;
    }
}
