/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.unmsm.factory;

import pe.com.unmsm.ChessGameBoard;
import pe.com.unmsm.ChessGamePiece;
import pe.com.unmsm.Pawn;

/**
 *
 * @author gperezr-e
 */
public class PieceFactory {
    public static ChessGamePiece getPawn(String nombre, ChessGameBoard board, int row, int col, int color){
        
        if(nombre.equals("pawn")){
            return (ChessGamePiece) Pawn.getPawn( board, row, col, ChessGamePiece.BLACK );
        } else if(nombre.equals("bishop")){
            //Method to get Bishop instance
        }
        return null;
    }
}
