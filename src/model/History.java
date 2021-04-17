/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Saroff
 */
public class History {
    
    private Integer id;
    private String lastGame;
    private Integer userId;
    private Integer wins;
    private Integer loses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLoses() {
        return loses;
    }

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
    
    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    @Override
    public String toString() {
        return "History("
                + "id="+id+", "
                + "lastGame="+lastGame+", "
                + "wins="+wins+", "
                + "loses="+loses+")";
    }

}