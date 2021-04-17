import javax.swing.*;

public class ResourcesPieceVisitorImpl implements ResourcesPieceVisitor {

    @Override
    public ImageIcon createImageByPieceType(Pawn pawn) {
        if (pawn.getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(
                    getClass().getResource("chessImages/WhitePawn.gif")
            );
        } else if (pawn.getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackPawn.gif")
            );
        } else {
            return new ImageIcon(
                    getClass().getResource("chessImages/default-Unassigned.gif")
            );
        }
    }

    @Override
    public ImageIcon createImageByPieceType(Queen queen) {
        if (queen.getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(
                    getClass().getResource("chessImages/WhiteQueen.gif")
            );
        } else if (queen.getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackQueen.gif")
            );
        } else {
            return new ImageIcon(
                    getClass().getResource("chessImages/default-Unassigned.gif")
            );
        }
    }

    @Override
    public ImageIcon createImageByPieceType(Rook rook) {
        if (rook.getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(
                    getClass().getResource("chessImages/WhiteRook.gif")
            );
        } else if (rook.getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackRook.gif")
            );
        } else {
            return new ImageIcon(
                    getClass().getResource("chessImages/default-Unassigned.gif")
            );
        }
    }

    @Override
    public ImageIcon createImageByPieceType(Knight knight) {
        if (knight.getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(
                    getClass().getResource("chessImages/WhiteKnight.gif")
            );
        } else if (knight.getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackKnight.gif")
            );
        } else {
            return new ImageIcon(
                    getClass().getResource("chessImages/default-Unassigned.gif")
            );
        }
    }

    @Override
    public ImageIcon createImageByPieceType(Bishop bishop) {
        if (bishop.getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(
                    getClass().getResource("chessImages/WhiteBishop.gif")
            );
        } else if (bishop.getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackBishop.gif")
            );
        } else {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackBishop.gif")
            );
        }
    }

    @Override
    public ImageIcon createImageByPieceType(King king) {
        if (king.getColorOfPiece() == ChessGamePiece.WHITE) {
            return new ImageIcon(
                    getClass().getResource("chessImages/WhiteKing.gif")
            );
        } else if (king.getColorOfPiece() == ChessGamePiece.BLACK) {
            return new ImageIcon(
                    getClass().getResource("chessImages/BlackKing.gif")
            );
        } else {
            return new ImageIcon(
                    getClass().getResource("chessImages/default-Unassigned.gif")
            );
        }
    }
}
