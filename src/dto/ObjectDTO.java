/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author Saroff
 */
public class ObjectDTO {
    private Integer id;
    private String name;
    private String password;
    private String lastGame;
    private Integer wins;
    private Integer loses;

    public Integer getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getLastGame() {
        return lastGame;
    }
    
    public Integer getWins() {
        return wins;
    }
    
    public Integer getLoses() {
        return loses;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public void setLoses(Integer loses) {
        this.loses = loses;
    }

    public void setLastGame(String lastGame) {
        this.lastGame = lastGame;
    }
    
    @Override
    public String toString() {
        return "Data("
                + "id="+id+", "
                + "name="+name+", "
                + "password="+password+", "
                + "lastGame="+lastGame+", "
                + "wins="+wins+", "
                + "loses="+loses+")";
    }
}
