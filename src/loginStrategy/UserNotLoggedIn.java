/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginStrategy;

import chess.InitializerGameFacade;
import interceptingFilter.Target;

/**
 *
 * @author Saroff
 */
public class UserNotLoggedIn implements LoginStrategy {
    
    Target target = new Target();
    
    @Override
    public void startGame() {
        message();
        game();
    }
    
    public void message() {
        System.out.println("You are in game whitout login");
    }
    
    public void game() {
        target.showNotLoggedInSession();
    }
}
