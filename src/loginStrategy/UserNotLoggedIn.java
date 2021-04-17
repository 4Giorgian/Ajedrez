/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginStrategy;



/**
 *
 * @author Sono Cattivo
 */
public class UserNotLoggedIn implements LoginStrategy {
    
  
    
    @Override
    public void startGame() {
        message();
        game();
    }
    
    public void message() {
        System.out.println("You are in game whitout login");
    }
    
    public void game() {
        
    }
}
    

