/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginStrategy;

/**
 *
 * @author Saroff
 */
public class Context {
    private LoginStrategy loginStrategy;
    
    public Context(LoginStrategy strategy) {
        this.loginStrategy = strategy;
    }
    
    public void execute() {
        this.loginStrategy.startGame();
    }
}
