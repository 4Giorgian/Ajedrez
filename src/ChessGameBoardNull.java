import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
// -------------------------------------------------------------------------
/**
 * The panel that represents the Chess game board. Contains a few methods that
 * allow other classes to access the physical board.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class ChessGameBoardNull extends JPanel implements ChessGameBoardAbstract {
    
    private BoardSquare[][] chessCells;
    private BoardListener   listener;
    // ----------------------------------------------------------
    /**
     * Returns the entire board.
     *
     * @return BoardSquare[][] the chess board
     */
    @Override
    public BoardSquare[][] getCells(){
        return chessCells;
    }
    /**
     * Checks to make sure row and column are valid indices.
     * @param row the row to check
     * @param col the column to check
     * @return boolean true if they are valid, false otherwise
     */
    @Override
    public boolean validateCoordinates( int row, int col ){
        return true;
    }
    // ----------------------------------------------------------
    /**
     * Gets the BoardSquare at row 'row' and column 'col'.
     * @param row the row to look at
     * @param col the column to look at
     * @return BoardSquare the square found, or null if it does not exist
     */
    @Override
    public BoardSquare getCell( int row, int col ){        
        return new BoardSquare();
    }
    // ----------------------------------------------------------
    /**
     * Clears the cell at 'row', 'col'.
     * @param row the row to look at
     * @param col the column to look at
     */
    @Override
    public void clearCell(int row, int col){
        System.out.println("clearCell");
    }
    // ----------------------------------------------------------
    /**
     * Gets all the white game pieces on the board.
     *
     * @return ArrayList<GamePiece> the pieces
     */
    @Override
    public ArrayList<ChessGamePiece> getAllWhitePieces(){
        ArrayList<ChessGamePiece> whitePieces = new ArrayList<ChessGamePiece>();
        
        return whitePieces;
    }
    // ----------------------------------------------------------
    /**
     * Gets all the black pieces on the board
     *
     * @return ArrayList<GamePiece> the pieces
     */
    @Override
    public ArrayList<ChessGamePiece> getAllBlackPieces(){
        ArrayList<ChessGamePiece> blackPieces = new ArrayList<ChessGamePiece>();
        
        return blackPieces;
    }
    // ----------------------------------------------------------
    /**
     * Create a new ChessGameBoard object.
     */
    public ChessGameBoardNull(){
        this.setLayout( new GridLayout( 8, 8, 1, 1 ) );
        listener = new BoardListener();
        chessCells = new BoardSquare[8][8];
        initializeBoard();
    }
    // ----------------------------------------------------------
    /**
     * Clears the board of all items, including any pieces left over in the
     * graveyard, and all old game logs.
     * @param addAfterReset if true, the board will add the BoardSquares
     * back to the board, if false it will simply reset everything and leave
     * the board blank.
     */
    @Override
    public void resetBoard ( boolean addAfterReset ){
       
        repaint();
        //revalidate();
        // only the combination of these two calls work...*shrug*
    }
    /**
     * (Re)initializes this ChessGameBoard to its default layout with all 32
     * pieces added.
     */
    @Override
    public void initializeBoard(){
        resetBoard( false );
       
    }
    // ----------------------------------------------------------
    /**
     * Clears the colors on the board.
     */
    @Override
    public void clearColorsOnBoard(){
     
    }
    /**
     * Listens for clicks on BoardSquares.
     *
     * @author Ben Katz (bakatz)
     * @author Danielle Bushrow (dbushrow)
     * @author Myles David (davidmm2)
     * @version 2010.11.16
     */ 
    private class BoardListener
        implements MouseListener
    {
        /**
         * Do an action when the left mouse button is clicked.
         *
         * @param e
         *            the event from the listener
         */
        public void mouseClicked( MouseEvent e ){
            if ( e.getButton() == MouseEvent.BUTTON1 &&
                getParent() instanceof ChessPanel ){
           
            }
        }
        /**
         * Unused method.
         *
         * @param e
         *            the mouse event from the listener
         */
        public void mouseEntered( MouseEvent e ){ /* not used */
        }
        /**
         * Unused method.
         *
         * @param e
         *            the mouse event from the listener
         */
        public void mouseExited( MouseEvent e ){ /* not used */
        }
        /**
         * Unused method.
         *
         * @param e
         *            the mouse event from the listener
         */
        public void mousePressed( MouseEvent e ){ /* not used */
        }
        /**
         * Unused method.
         *
         * @param e
         *            the mouse event from the listener
         */
        public void mouseReleased( MouseEvent e ){ /* not used */
        }
    }
}
