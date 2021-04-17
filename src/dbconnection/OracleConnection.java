/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.History;
import model.User;

/**
 *
 * @author Saroff
 */
public class OracleConnection {
    
    public Connection connection() throws SQLException {
        Connection connection = null;
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "webdeveloper", "webdeveloper");
            return connection;
        } catch (Exception e) {
            System.out.println("An exception was found in connection: " + e);
            return null;
        }
    }
    
    public User getUserByName(String name) throws SQLException {
        Connection connection;
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            connection = connection();
            String query = "select * from CHESS_USERS WHERE CUSR_NAME = ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            
        } catch (Exception e) {
            System.out.println("An exception was found: " + e);

        }
        
        User user = new User();
        while (rs.next()) {
            user.setId(rs.getInt(1));
            user.setName(rs.getString(2));
            user.setPassword(rs.getString(3));
        }
        return user;
    }
    
    public History getHistoryByUserId(int userId) throws SQLException {
        Connection connection;
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            connection = connection();
            String query = "select * from CHESS_HISTORY WHERE CHIS_USR = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            
        } catch (Exception e) {
            System.out.println("An exception was found: " + e);

        }
        
        History history = new History();
        while (rs.next()) {
            history.setId(rs.getInt(1));
            history.setUserId(rs.getInt(2));
            history.setLastGame(rs.getString(3));
            history.setWins(rs.getInt(4));
            history.setLoses(rs.getInt(5));
        }
        return history;
    }
    
}
