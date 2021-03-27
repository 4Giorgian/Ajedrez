package pe.com.unmsm.builder;

import pe.com.unmsm.ChessGameBoard;
import pe.com.unmsm.ChessGamePiece;

/**
 *
 * @author gperezr-e
 */
public interface PieceBuilder {
    public PawnBuilder withBoard(ChessGameBoard board);
    public PawnBuilder withRaw(int row);
    public PawnBuilder withCol(int col);
    public PawnBuilder withColor(int color);
    public ChessGamePiece build();
}
