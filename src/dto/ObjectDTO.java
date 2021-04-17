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

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * @return the wins
     */
    public Integer getWins() {
        return wins;
    }

    /**
     * @param wins the wins to set
     */
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    /**
     * @return the loses
     */
    public Integer getLoses() {
        return loses;
    }

    /**
     * @param loses the loses to set
     */
    public void setLoses(Integer loses) {
        this.loses = loses;
    }
    

    /**
     * @return the lastGame
     */
    public String getLastGame() {
        return lastGame;
    }

    /**
     * @param lastGame the lastGame to set
     */
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
