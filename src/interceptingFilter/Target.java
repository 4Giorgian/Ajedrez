/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptingFilter;

import chess.InitializerGameFacade;
import loginStrategy.LoginStrategy;

/**
 *
 * @author Saroff
 */
public class Target {
    
    LoginStrategy strategy;
    
    public void showLoggedInSession() {
        InitializerGameFacade gameFacade = new InitializerGameFacade("Registered Game");
        gameFacade.createGame();
    }
    
    public void showNotLoggedInSession() {
        InitializerGameFacade gameFacade = new InitializerGameFacade("Quick Game");
        gameFacade.createGame();
    }
    
}
