/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filtro;

import chess.FacadeChess;
import loginStrategy.LoginStrategy;

/**
 *
 * @author Saroff
 */
public class Target {
    
    LoginStrategy strategy;
    
    public void showLoggedInSession() {
        FacadeChess gameFacade = new FacadeChess("Registered Game");
        gameFacade.createGame();
    }
    
    public void showNotLoggedInSession() {
        FacadeChess gameFacade = new FacadeChess("Quick Game");
        gameFacade.createGame();
    }
    
}
