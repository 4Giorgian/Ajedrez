/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filtro;

import loginStrategy.Context;
import loginStrategy.UserLoggedIn;
import loginStrategy.UserNotLoggedIn;

/**
 *
 * @author Sono Cattivo
 */
public class FilterManager {
    
    Context context = null;
    
    public void enableUserLoggedIn() {
        context = new Context(new UserLoggedIn());
        context.execute();
    }
    
    public void enableUserNotLoggedIn() {
        context = new Context(new UserNotLoggedIn());
        context.execute();
    }
    
}
