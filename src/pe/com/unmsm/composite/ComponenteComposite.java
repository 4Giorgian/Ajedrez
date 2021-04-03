/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.unmsm.composite;

import java.util.ArrayList;
import pe.com.unmsm.ChessGameBoard;

/**
 *
 * @author gperezr-e
 */
public interface ComponenteComposite {
    public ArrayList<String> calculatePossibleMoves(ChessGameBoard board);
}
