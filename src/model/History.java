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
