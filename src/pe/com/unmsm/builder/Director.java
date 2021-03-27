package pe.com.unmsm.builder;

import pe.com.unmsm.ChessGameBoard;
import pe.com.unmsm.ChessGamePiece;

/**
 *
 * @author gperezr-e
 */
public class Director {

    private PieceBuilder pieceBuilder;

    public void setPiece(PieceBuilder piece) {
        pieceBuilder = piece;
    }

    public ChessGamePiece constructor(ChessGameBoard board, int row, int col, int color) {
        return pieceBuilder.withBoard(board)
                .withRaw(row)
                .withCol(col)
                .withColor(color)
                .build();
    }
}
