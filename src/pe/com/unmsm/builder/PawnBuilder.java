package pe.com.unmsm.builder;

import pe.com.unmsm.ChessGameBoard;
import pe.com.unmsm.ChessGamePiece;
import pe.com.unmsm.Pawn;

public class PawnBuilder implements PieceBuilder{
    private ChessGameBoard board;
    private int row;
    private int col;
    private int color;
    
    public PawnBuilder withBoard(ChessGameBoard board){
        this.board = board;
        return this;
    }
    
    public PawnBuilder withRaw(int row){
        this.row = row;
        return this;
    }
    
    public PawnBuilder withCol(int col){
        this.col = col;
        return this;
    }
    
    public PawnBuilder withColor(int color){
        this.color = color;
        return this;
    }
    
    @Override
    public ChessGamePiece build() {
        return new Pawn(this.board, this.row, this.col, this.color);
    }
    
}
