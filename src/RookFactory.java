/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niquito
 */
public class RookFactory extends ChessPieceFactory {
    
    @Override
    public ChessPiece createChessPiece() {
        return new Rook();
    }
}