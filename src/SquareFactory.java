public class SquareFactory implements AbstractElementsBoardFactory{


    @Override
    public BoardSquare createBoardSquare(int row, int col, ChessGamePiece piece) {
        // TODO Auto-generated method stub
        return new BoardSquare(row, col, piece);
    }
    
    @Override
    public ChessGamePiece CreateStandarPiece(String pieceName, ChessGameBoard board, int row, int col, int color) {
        // TODO Auto-generated method stub
        return null;
    }

}
