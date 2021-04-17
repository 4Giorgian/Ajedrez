import javax.swing.*;

public interface ResourcesPieceVisitor {

    ImageIcon createImageByPieceType(Pawn pawn);
    ImageIcon createImageByPieceType(Queen queen);
    ImageIcon createImageByPieceType(Rook rook);
    ImageIcon createImageByPieceType(Knight knight);
    ImageIcon createImageByPieceType(Bishop bishop);
    ImageIcon createImageByPieceType(King king);

}
