package chess;

public  interface AbstractElementsBoardFactory {
    ChessGamePiece CreateStandarPiece(String pieceName, ChessGameBoard board, int row, int col, int color);
    BoardSquare createBoardSquare(int row, int col, ChessGamePiece piece);
}
