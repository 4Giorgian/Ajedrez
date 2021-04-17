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
public class UserLoggedIn implements LoginStrategy {
    
    
    
    @Override
    public void startGame() {
        message();
        showMembership();
        game();
    }
    
    public void message() {
        System.out.println("you are logged");
    }
    
    public void showMembership() {
        System.out.println("You are member");
    }
    
    public void game() {
       
    }
}

